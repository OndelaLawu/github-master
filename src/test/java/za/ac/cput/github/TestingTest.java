/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.github;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author chads
 */
public class TestingTest {
    
    public TestingTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
       
        fail("The test case is a prototype.");
    }
  @Test // Ondela
    public void Failingtest() {
        fail("Hello Everyone ");
    }
    @Test //Ondela
    public void testEquality(){
        String obj1 = "Junit";
        String obj2 = "Junit";
        assertEquals(obj1, obj2);
    }
    @Test //Ondela
    public void testIdentity(){
        String obj3 = "Ondela";
        String obj4 = "Ondela";
        assertSame(obj3, obj4);
    }
    @Test //Ondela
    @Disabled
    public void disabledTest(){
    
        System.out.println("The Sum of a + b = " +sum);
    }
    
}
