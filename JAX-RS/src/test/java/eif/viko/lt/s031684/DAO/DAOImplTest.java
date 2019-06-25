package eif.viko.lt.s031684.DAO;

import eif.viko.lt.s031684.entities.Game;
import eif.viko.lt.s031684.entities.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author M
 */
public class DAOImplTest {
    
    private DAOImpl instance;
    
    @Before
    public void setUp() {
        instance = new DAOImpl();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testGetAllUsers() {
        assertEquals(1,instance.getAllUsers().get(0).getId());
        assertEquals("gizmoUserz", instance.getAllUsers().get(0).getUsername());
        assertEquals("paswordpro", instance.getAllUsers().get(0).getPassword());
        assertEquals("MyMail@gamil.com", instance.getAllUsers().get(0).getEmail());
        assertEquals(false,instance.getAllUsers().get(0).isEmailVer());
        assertEquals(59.99,instance.getAllUsers().get(0).getPrice(),0.1);
    }
    
    @Test
    public void testGetAllGames() {
        assertEquals(1,instance.getAllGames().get(0).getId());
        assertEquals(1,instance.getAllGames().get(0).getAccountId());
        assertEquals("Call Of Duty 5", instance.getAllGames().get(0).getName());
        assertEquals("Shooter", instance.getAllGames().get(0).getType());
        assertEquals(10,instance.getAllGames().get(0).getAchievements());
        assertEquals(11,instance.getAllGames().get(0).getLevel());
        assertEquals("Master", instance.getAllGames().get(0).getRank());
        assertEquals(false,instance.getAllGames().get(0).isRareSkins());
    }


    /**
     * Test of addUser method, of class DAOImpl.
     */
    @Test
    public void testAddUser() {
        User user = new User (1,"username","password","email",false,0.0);
        instance.addUser(user);
        int i = instance.getAllUsers().size() -1;
        assertEquals("username", instance.getAllUsers().get(i).getUsername());
        assertEquals("password", instance.getAllUsers().get(i).getPassword());
        assertEquals("email", instance.getAllUsers().get(i).getEmail());
        assertEquals(false,instance.getAllUsers().get(i).isEmailVer());
        assertEquals(0.0,instance.getAllUsers().get(i).getPrice(),0.1);
    }

    /**
     * Test of addGame method, of class DAOImpl.
     */
    @Test
    public void testAddGame() {
        Game game = new Game(2,2,"game","typer",2,2,"rank",false);
        instance.addGame(game);
        int i = instance.getAllGames().size() -1 ;
        assertEquals(2,instance.getAllGames().get(i).getAccountId());
        assertEquals("game", instance.getAllGames().get(i).getName());
        assertEquals("typer", instance.getAllGames().get(i).getType());
        assertEquals(2,instance.getAllGames().get(i).getAchievements());
        assertEquals(2,instance.getAllGames().get(i).getLevel());
        assertEquals("rank", instance.getAllGames().get(i).getRank());
        assertEquals(false,instance.getAllGames().get(i).isRareSkins());
    }

    /**
     * Test of deleteUser method, of class DAOImpl.
     */
    @Test
    public void testDeleteUser() {
        assertTrue(instance.deleteUser(1));
    }

    /**
     * Test of deleteGame method, of class DAOImpl.
     */
    @Test
    public void testDeleteGame() {
        assertTrue(instance.deleteGame(1));
    }

    /**
     * Test of editUser method, of class DAOImpl.
     */
    @Test
    public void testEditUser() {
        User user = new User (1,"gizmoUserz","paswordpro","MyMail@gamil.com",false,59.99);
        instance.editUser(1, user);
        assertEquals("gizmoUserz", instance.getAllUsers().get(0).getUsername());
        assertEquals("paswordpro", instance.getAllUsers().get(0).getPassword());
        assertEquals("MyMail@gamil.com", instance.getAllUsers().get(0).getEmail());
        assertEquals(false,instance.getAllUsers().get(0).isEmailVer());
        assertEquals(59.99,instance.getAllUsers().get(0).getPrice(),0.1);
    }

    /**
     * Test of editGame method, of class DAOImpl.
     */
    @Test
    public void testEditGame() {
        Game game = new Game(1,1,"Call Of Duty 5","Shooter",10,11,"Master",false);
        instance.editGame(1, game);
        assertEquals(1,instance.getAllGames().get(0).getId());
        assertEquals(1,instance.getAllGames().get(0).getAccountId());
        assertEquals("Call Of Duty 5", instance.getAllGames().get(0).getName());
        assertEquals("Shooter", instance.getAllGames().get(0).getType());
        assertEquals(10,instance.getAllGames().get(0).getAchievements());
        assertEquals(11,instance.getAllGames().get(0).getLevel());
        assertEquals("Master", instance.getAllGames().get(0).getRank());
        assertEquals(false,instance.getAllGames().get(0).isRareSkins());
    }

    
    

    
}
