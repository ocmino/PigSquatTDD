package se.jonathan;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static se.jonathan.PigSquat.*;

class PigSquatTest {



    @BeforeEach
    public void newTest(){
        System.out.println("Test result:");
    }



    @AfterEach
    public void endOfTest() {
        System.out.println("Test completed...");
    }



    @Test
    @DisplayName("Any barbell weight other than 15 or 20 should throw an exception.")
    public void testBarbellWeight(){
        barbell("25");
    }



    @Test
    @DisplayName("Any weight increament over 10 kg should throw an exception")
    public void testSetIncrement(){
        increment("15");
    }



    @Test
    @DisplayName("Zero increment should throw an exception")
    public void testSetIncrementLowest(){
        Assertions.assertNotEquals("0", increment("0"));
    }



    @Test
    @DisplayName("Not passing health check should throw an exception")
    public void testHealthCheck() {
        Assertions.assertTrue(healthCheck(false));
    }

}