package eif.viko.lt.s031684.DAO;

import eif.viko.lt.s031684.Database.Database;
import eif.viko.lt.s031684.entities.Game;
import eif.viko.lt.s031684.entities.User;
import java.util.ArrayList;
import java.util.List;

/**
 * Implements DAO 
 * @author M
 */
public class DAOImpl implements DAO {
    
    private static Database db = new Database();
 
    @Override
    public List<User> getAllUsers() {
        return db.getUsers();
    }
    

    @Override 
    public User getUser(int id) {
        return db.getUsers().get(id);
    }

    @Override
    public List<Game> getAllGames() {
        return db.getGames();
    }

    @Override
    public Game getGame(int id) {
        return db.getGames().get(id);
    }

    @Override
    public User addUser(User user) {
        try{
            user.setId(db.getUsers().size() + 1);
            db.getUsers().add(user);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return user;
    }

    @Override
    public Game addGame(Game game) {
        try {
            game.setId(db.getGames().size() + 1);
            for (User user : db.getUsers()) {
                if (user.getId() == game.getAccountId()) {
                    user.addGames(game);
                    break;
                }
            }
            db.getGames().add(game);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return game;
    }

    @Override
    public boolean deleteUser(int id) {
        try{
            for (User user : db.getUsers()){
                if(user.getId() == id){
                    db.getUsers().remove(user);
                    return true;
                }
            }
            return false;
            
        }catch(Exception e){
           return false;
        }
    }

    @Override
    public boolean deleteGame(int id) {
        try{
            for (Game game : db.getGames()) {
                if (game.getId() == id) {
                    db.getGames().remove(game);

                    for (User user : db.getUsers()) {
                        if (user.getId() == game.getAccountId()) {
                            user.removeGame(game);
                        }
                    }
                    return true;
                }
            }
            return false;
        }catch (Exception e){
           return false;
        }
                    
    }

    @Override
    public User editUser(int id, User user) {
        try {
            int i = 0;
            for (User user1 : db.getUsers()) {
                if (user1.getId() == id) {
                    user.setId(id);
                    user.setGames(user1.getGames());
                    db.getUsers().set(i, user);
                    break;
                }
                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return user;
    }

    @Override
    public Game editGame(int id, Game game) {
        try {
            int i = 0;
            for (Game game1 : db.getGames()) {
                if (game1.getId() == id) {
                    game.setId(id);
                    db.getGames().set(i, game);
                    int j = 0;
                    for (User user1 : db.getUsers()) {
                        if (user1.getId() == game.getAccountId()) {
                            user1.getGames().set(j, game);
                            break;
                        }
                        j++;
                    }
                    break;
                }
                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return game;
    }

    @Override
    public List<Game> getSameTypeGames(String type) {
        
        List<Game> temp = new ArrayList();
        
        for(Game game : db.getGames()){
            
            if(type.equals(game.getType())){
                temp.add(game);
            }
        }
        return temp;
    }
    
}
