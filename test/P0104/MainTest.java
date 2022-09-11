/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0104;

import java.util.ArrayList;
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
public class MainTest {
    
    public MainTest() {
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
     * Test of checkString method, of class Main.
     */
    @Test
    public void testCheckString() {
        System.out.println("checkString");
        String expResult = "";
        String result = Main.checkString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of inputDirectory method, of class Main.
     */
    @Test
    public void testInputDirectory() {
        System.out.println("inputDirectory");
        String expResult = "";
        String result = Main.inputDirectory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of inputStringToSearch method, of class Main.
     */
    @Test
    public void testInputStringToSearch() {
        System.out.println("inputStringToSearch");
        String expResult = "";
        String result = Main.inputStringToSearch();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of searchString method, of class Main.
     */
    @Test
    public void testSearchString() {
        System.out.println("searchString");
        String stringToSearch = "";
        String directory = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = Main.searchString(stringToSearch, directory);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of displayResult method, of class Main.
     */
    @Test
    public void testDisplayResult() {
        System.out.println("displayResult");
        ArrayList<String> result_2 = null;
        Main.displayResult(result_2);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
