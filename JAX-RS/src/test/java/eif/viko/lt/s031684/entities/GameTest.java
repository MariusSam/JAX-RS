package eif.viko.lt.s031684.entities;

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
public class GameTest {
    
    private Game instance;
    
    
    @Before
    public void setUp() {
        instance = new Game();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of getId method, of class Game.
     */
    @Test
    public void testGetId() {
        instance.setId(1);
        assertEquals(instance.getId(),1);
    }

    
    /**
     * Test of getAccountId method, of class Game.
     */
    @Test
    public void testGetAccountId() {
        instance.setAccountId(55);
        assertEquals(instance.getAccountId(),55);
    }

    /**
     * Test of getName method, of class Game.
     */
    @Test
    public void testGetName() {
        instance.setName("namee");
        assertEquals(instance.getName(),"namee");
    }


    /**
     * Test of getType method, of class Game.
     */
    @Test
    public void testGetType() {
        instance.setType("typer");
        assertEquals(instance.getType(),"typer");
    }

    
    /**
     * Test of getAchievements method, of class Game.
     */
    @Test
    public void testGetAchievements() {
        instance.setAchievements(147);
        assertEquals(instance.getAchievements(),147);
    }

    

    /**
     * Test of getLevel method, of class Game.
     */
    @Test
    public void testGetLevel() {
        instance.setLevel(99);
        assertEquals(instance.getLevel(),99);
    }

   

    /**
     * Test of getRank method, of class Game.
     */
    @Test
    public void testGetRank() {
        instance.setRank("PRO");
        assertEquals(instance.getRank(),"PRO");
    }

    

    /**
     * Test of isRareSkins method, of class Game.
     */
    @Test
    public void testIsRareSkins() {
        instance.setRareSkins(true);
        assertEquals(instance.isRareSkins(),true);
    }

    
}
