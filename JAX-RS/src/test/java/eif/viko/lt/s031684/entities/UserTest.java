package eif.viko.lt.s031684.entities;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author M
 */
public class UserTest {
    
    private User instance;
    
    @Before
    public void setUp() {
        instance = new User();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of getGames method, of class User.
     */
    @Test
    public void testGetGames() {
        Game game = new Game();
        instance.addGames(game);
        assertTrue(instance.getGames().contains(game));
    }


    /**
     * Test of getId method, of class User.
     */
    @Test
    public void testGetId() {
        instance.setId(88);
        assertEquals(88,instance.getId());
    }



    /**
     * Test of getUsername method, of class User.
     */
    @Test
    public void testGetUsername() {
        instance.setUsername("NewUser");
        assertEquals("NewUser",instance.getUsername());
    }

    

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        instance.setPassword("PassWord");
        assertEquals("PassWord", instance.getPassword());
    }

   

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
        instance.setEmail("emailas");
        assertEquals(instance.getEmail(),"emailas");
    }

    

    /**
     * Test of isEmailVer method, of class User.
     */
    @Test
    public void testIsEmailVer() {
        instance.setEmailVer(true);
        assertEquals(instance.isEmailVer(),true);
        
    }

    

    /**
     * Test of getPrice method, of class User.
     */
    @Test
    public void testGetPrice() {
        instance.setPrice(999.99);
        assertEquals(instance.getPrice(),999.99,0.0);
    }

    
}
