/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H206;

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
public class H206Test {
    
    public H206Test() {
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
     * Test of printSqure method, of class H206.
     */
    @Test
    public void testPrintSqure() {
        System.out.println("printSqure");
        int min = null;
        int max = null;
        H206.printSqure(min, max);

    }

    /**
     * Test of main method, of class H206.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        H206.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
