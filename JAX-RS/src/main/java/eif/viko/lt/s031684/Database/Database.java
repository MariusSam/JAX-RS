package eif.viko.lt.s031684.Database;

import eif.viko.lt.s031684.entities.Game;
import eif.viko.lt.s031684.entities.User;
import java.util.ArrayList;
import java.util.List;

/**
 * Database class
 * @author M
 */
public class Database {
    
    private List<User> users = new ArrayList();
    
    /**
     *
     */
    public Database(){
        Game game = new Game(1,1,"Call Of Duty 5","Shooter",10,11,"Master",false);
        Game game2 = new Game(2,1,"CS:GO","Shooter",120,35,"Nova 4",true);
        Game game3 = new Game(3,1,"GTA V","Action",15,0,"Pro",false);
        Game game4 = new Game(4,2,"CS:GO","Shooter",115,20,"Silver Elite Master",false);
        Game game5 = new Game(5,2,"Endless Space 2","Action",54,20,"Noob",true);
        User user = new User(1,"gizmoUserz","paswordpro","MyMail@gamil.com",false,59.99);
        User user2 = new User(2,"CoolerThanU","omegaabd","gamingol@gamil.com",true,29.99);
        user.addGames(game);
        user.addGames(game2);
        user.addGames(game3);
        user2.addGames(game4);
        user2.addGames(game5);
        users.add(user);
        users.add(user2);
    }
    
    /**
     * Method for getting list of users
     * @return List of users
     */
    public List<User> getUsers(){
        return users;
    }
    
    /**
     * Method for getting list of games
     * @return List of games
     */
    public List<Game> getGames(){
        List<Game> games = new ArrayList();
        for(User user : users){
            games.addAll(user.getGames());
        }
        return games;
    }
}
