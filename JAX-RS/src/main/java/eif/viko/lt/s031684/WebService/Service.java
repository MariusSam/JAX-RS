package eif.viko.lt.s031684.WebService;

import eif.viko.lt.s031684.entities.Game;
import eif.viko.lt.s031684.entities.User;
import java.util.List;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.PathParam;

/**
 * Web Service interface
 * @author M
 */
public interface Service {
    
    public List<User> getAllUsers();
    public List<Game> getAllGames();
    public User getUser (@PathParam("id")int id);
    public Game getGame (@PathParam("id")int id);
    public User addUser (User user);
    public Game addGame (Game game);
    public boolean deleteUser (@PathParam("id")int id);
    public boolean deleteGame (@PathParam("id")int id);
    public User editUser(@PathParam("id")int id, User user);
    public Game editGame(@PathParam("id")int id, Game game);
    public List<Game> getSameTypeGame(@MatrixParam("type")String type);
    
    
}
