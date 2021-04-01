/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.github;

/**
 *
 * @author OndelA
 */
public class ArrayTesting {
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
