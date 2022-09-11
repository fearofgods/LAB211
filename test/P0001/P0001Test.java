/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0001;

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
public class P0001Test {
    
    public P0001Test() {
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
     * Test of validateInput method, of class P0001.
     */
    @Test
    public void testValidateInput() {
        System.out.println("validateInput");
        int expResult = 0;
        int result = P0001.validateInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inputSizeArray method, of class P0001.
     */
    @Test
    public void testInputSizeArray() {
        System.out.println("inputSizeArray");
        int expResult = 0;
        int result = P0001.inputSizeArray();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of randomNumber method, of class P0001.
     */
    @Test
    public void testRandomNumber() {
        System.out.println("randomNumber");
        int size = 0;
        int[] expResult = null;
        int[] result = P0001.randomNumber(size);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortingBubbleSort method, of class P0001.
     */
    @Test
    public void testSortingBubbleSort() {
        System.out.println("sortingBubbleSort");
        int[] a = null;
        P0001.sortingBubbleSort(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printArray method, of class P0001.
     */
    @Test
    public void testPrintArray() {
        System.out.println("printArray");
        int[] a = null;
        P0001.printArray(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class P0001.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        P0001.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
