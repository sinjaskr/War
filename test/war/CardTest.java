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
public class CardTest {
    
    public CardTest() {
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
     * Test of isSameSuit method, of class Card.
     */
    @Test
    public void testIsSameSuitGood() {
        System.out.println("isSameSuit Good");
        Card other = new Card(Position.FIVE, Suit.DIAMONDS);
        Card instance = new Card(Position.ACE, Suit.DIAMONDS);
        boolean expResult = true;
        boolean result = instance.isSameSuit(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIsSameSuitBad() {
        System.out.println("isSameSuit Bad");
        Card other = new Card(Position.FIVE, Suit.HEARTS);
        Card instance = new Card(Position.ACE, Suit.DIAMONDS);
        boolean expResult = false;
        boolean result = instance.isSameSuit(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIsSameSuitBoundary() {
        System.out.println("isSameSuit Boundary");
        Card other = new Card(Position.ACE, Suit.CLUBS);
        Card instance = new Card(Position.ACE, Suit.HEARTS);
        boolean expResult = false;
        boolean result = instance.isSameSuit(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isSamePosition method, of class Card.
     */
    @Test
    public void testIsSamePositionGood() {
        System.out.println("isSamePosition Good");
        Card other = new Card(Position.ACE, Suit.DIAMONDS);
        Card instance = new Card(Position.ACE, Suit.DIAMONDS);
        boolean expResult = true;
        boolean result = instance.isSamePosition(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIsSamePositionBad() {
        System.out.println("isSamePosition Bad");
        Card other = new Card(Position.FIVE, Suit.HEARTS);
        Card instance = new Card(Position.ACE, Suit.DIAMONDS);
        boolean expResult = false;
        boolean result = instance.isSamePosition(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIsSamePositionBoundary() {
        System.out.println("isSamePosition Boundary");
        Card other = new Card(Position.ACE, Suit.HEARTS);
        Card instance = new Card(Position.FIVE, Suit.HEARTS);
        boolean expResult = false;
        boolean result = instance.isSamePosition(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Card.
     */
    @Test
    public void testEqualsGood() {
        System.out.println("equals Good");
        Object obj  = new Card(Position.FIVE, Suit.DIAMONDS);
        Card instance = new Card(Position.FIVE, Suit.DIAMONDS);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEqualsBad() {
        System.out.println("equals Bad");
        Object obj  = new Card(Position.FIVE, Suit.DIAMONDS);
        Card instance = new Card(Position.ACE, Suit.DIAMONDS);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEqualsBoundary() {
        System.out.println("equals Boundary");
         Object obj  = new Card(Position.FIVE, Suit.DIAMONDS);
        Card instance = new Card(Position.ACE, Suit.DIAMONDS);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
