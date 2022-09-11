/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H202;

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
public class H202Test {
    
    public H202Test() {
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
     * Test of printReverse method, of class H202.
     */
    @Test
    public void testPrintReverse() {
        System.out.println("printReverse");
        String input = "ABCDEF";
        String expResult = "FEDCBA";
        String result = H202.printReverse(input);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of main method, of class H202.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        H202.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
