/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package war;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jaska
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of startGame method, of class Game.
     
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        Game instance = new Game();
        instance.startGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */

    /**
     * Test of distributeCards method, of class Game.
     
    @Test
    public void testDistributeCards() {
        System.out.println("distributeCards");
        GroupOfCards goc = null;
        Game instance = new Game();
        instance.distributeCards(goc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */

    /**
     * Test of battle method, of class Game.
     */
    @Test
    public void testBattleGood() {
        System.out.println("battle Good");
        Player p1 = null;
        Player p2 = null;
        GroupOfCards pot = null;
        Game instance = new Game();
        boolean expResult = true;
        boolean result = instance.battle(p1, p2, pot);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBattleBad() {
        System.out.println("battle Bad");
        Player p1 = null;
        Player p2 = null;
        GroupOfCards pot = null;
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.battle(p1, p2, pot);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBattleBoundary() {
        System.out.println("battle Boundary");
        Player p1 = null;
        Player p2 = null;
        GroupOfCards pot = null;
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.battle(p1, p2, pot);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
