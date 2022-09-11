/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0011;

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
public class ValidateTest {
    
    public ValidateTest() {
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
     * Test of checkInputLimit method, of class Validate.
     */
    @Test
    public void testCheckInputLimit() {
        System.out.println("checkInputLimit");
        int min = 0;
        int max = 0;
        int expResult = 0;
        int result = Validate.checkInputLimit(min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkBinary method, of class Validate.
     */
    @Test
    public void testCheckBinary() {
        System.out.println("checkBinary");
        String expResult = "";
        String result = Validate.checkBinary();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkDecimal method, of class Validate.
     */
    @Test
    public void testCheckDecimal() {
        System.out.println("checkDecimal");
        String expResult = "";
        String result = Validate.checkDecimal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkHex method, of class Validate.
     */
    @Test
    public void testCheckHex() {
        System.out.println("checkHex");
        String expResult = "";
        String result = Validate.checkHex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
