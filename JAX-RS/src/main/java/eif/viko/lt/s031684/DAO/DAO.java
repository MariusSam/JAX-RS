package eif.viko.lt.s031684.DAO;

import eif.viko.lt.s031684.entities.Game;
import eif.viko.lt.s031684.entities.User;
import java.util.List;

/**
 * DAO interface
 * @author M
 */
public interface DAO {
    
    /**
     * Method for getting all users
     * @return Users list
     */
    public List <User> getAllUsers();

    /**
     * Method for getting specific user
     * @param id User ID
     * @return User
     */
    public User getUser (int id);

    /**
     * Method for getting all games
     * @return Games list
     */
    public List <Game> getAllGames();

    /**
     * Method for getting specific game
     * @param id Game ID
     * @return Game
     */
    public Game getGame (int id);

    /**
     * Method for adding new user
     * @param user User object
     * @return 
     */
    public User addUser (User user);

    /**
     * Method for adding new game
     * @param game Game object  
     * @return
     */
    public Game addGame (Game game);

    /**
     * Method for deleting user
     * @param id User ID
     * @return Deleting status (true/false)
     */
    public boolean deleteUser(int id);

    /**
     * Method for deleting game
     * @param id Game ID
     * @return Deleting status (true/false)
     */
    public boolean deleteGame (int id);

    /**
     * Method for editing user
     * @param id User ID
     * @param user User object 
     * @return User object 
     */
    public User editUser (int id, User user);

    /**
     * Method for editing game
     * @param id Game ID
     * @param game Game object 
     * @return Game object
     */
    public Game editGame (int id, Game game);

    /**
     * Method for getting games with same type
     * @param type Game type
     * @return List of games with same type
     */
    public List<Game> getSameTypeGames(String type);
    
    
    
}
