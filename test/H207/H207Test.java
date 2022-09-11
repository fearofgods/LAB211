/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H207;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hongd
 */
public class H207Test {
    
    public H207Test() {
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
     * Test of secondHalfLetters method, of class H207.
     */
    @Test
    public void testSecondHalfLetters() {
        System.out.println("secondHalfLetters");
        String input = null;
        int expResult = 0;
        int result = H207.secondHalfLetters(input);
        assertEquals(expResult, result);

    }

    /**
     * Test of main method, of class H207.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        H207.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
