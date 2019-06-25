package eif.viko.lt.s031684.WebService;

import eif.viko.lt.s031684.DAO.DAO;
import eif.viko.lt.s031684.DAO.DAOImpl;
import eif.viko.lt.s031684.entities.Game;
import eif.viko.lt.s031684.entities.User;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Service implementation class
 * @author M
 */
@Path("data")
public class ServiceImpl implements Service{
    
    private DAO data = new DAOImpl();
    
    /**
     * Method for getting list of users
     * @return Users List
     */
    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("users")
    public List<User> getAllUsers() {
        
        return data.getAllUsers();
    }

    /**
     * Method for getting list of games
     * @return Games list
     */
    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("games")
    public List<Game> getAllGames() {
        return data.getAllGames();
    }

    /**
     * Method for getting specific user
     * @param id User id
     * @return User by id
     */
    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("users/{id}") 
    public User getUser(@PathParam("id") int id) {
        return data.getUser(id-1);
    }
    
    /**
     * Method for getting specific game
     * @param id Game id
     * @return Game by id
     */
    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("games/{id}")
    public Game getGame(@PathParam("id") int id) {
        return data.getGame(id-1);
    }

    /**
     * Method for adding user
     * @param user User object
     * @return Added user
     */
    @Override
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("users")
    public User addUser(User user) {
        return data.addUser(user);
    }

    /**
     * Method for adding game
     * @param game Game object
     * @return Added game
     */
    @Override
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("games")
    public Game addGame(Game game) {
        return data.addGame(game);
    }

    /**
     * Method for deleting user
     * @param id User id
     * @return Deleting status
     */
    @Override
    @DELETE
    @Path("users/{id}")
    public boolean deleteUser(@PathParam("id") int id) {
        return data.deleteUser(id);
    }

    /**
     * Method for deleting game
     * @param id Game id
     * @return Deleting status
     */
    @Override
    @DELETE
    @Path("games/{id}")
    public boolean deleteGame(@PathParam("id") int id) {
        return data.deleteGame(id);
    }

    /**
     * Method for user edition
     * @param id User id
     * @param user User object
     * @return User 
     */
    @Override
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("users/{id}")
    public User editUser(@PathParam("id") int id, User user) {
        return data.editUser(id, user);
    }

    /**
     * Method for game edition
     * @param id Game id
     * @param game Game object
     * @return Game 
     */
    @Override
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("games/{id}")
    public Game editGame(@PathParam("id") int id, Game game) {
        return data.editGame(id, game);
    }

    /**
     * Method for getting games with same type
     * @param type Game type
     * @return Games list
     */
    @Override
    @GET
    @Path("games/filter")
    public List<Game> getSameTypeGame(@MatrixParam("type") String type) {
        
        return data.getSameTypeGames(type);
    }
}
