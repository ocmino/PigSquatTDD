package se.jonathan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static se.jonathan.PigSquat.*;

class PigSquatTest {

    @BeforeEach
    public void newTest(){
        System.out.println("Test result:");
    }

    @Test
    @DisplayName("Any barbell weight other than 15 or 20 should throw an exception.")
    public void testBarbellWeight(){
        barbell("25");
    }

    @Test
    @DisplayName("Any weight increament over 10 kg should throw an exception")
    public void testSetIncrement(){
        increment("12");
    }

    @Test
    @DisplayName("Zero increment should throw an exception")
    public void testSetIncrementLowest(){
        Assertions.assertEquals("0", increment("0"));
    }

    @Test
    @DisplayName("Not passing health check should throw an exception")
    public void testHealthCheck() {
        Assertions.assertTrue(healthCheck(false));
    }

}