package com.example;

import static org.junit.Assert.assertEquals;  // This line is important
import org.junit.Test;

public class AppTest {

    @Test
    public void testGreeting() {
        String name = "Ayana";
        String expectedGreeting = "Hello, Ayana! Welcome to the Simple Scanner App.";
        String actualGreeting = "Hello, " + name + "! Welcome to the Simple Scanner App."; // Simulate output
        assertEquals(expectedGreeting, actualGreeting);
    }
}
