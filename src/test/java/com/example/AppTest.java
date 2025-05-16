
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;  // Add this
import java.io.PrintStream;           // Add this

class AppTest {

    @Test
    void testGreet() {
        // Test the greet() method
        assertEquals("Hello, Alice!", App.greet("Alice"));
        assertEquals("Hello, World!", App.greet("World"));
    }

    @Test
    void testMainOutput() {
        // Backup original System.out
        PrintStream originalOut = System.out;

        // Redirect System.out to capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        // Test main()
        App.main(new String[]{});
        
        // Restore System.out
        System.setOut(originalOut);
        
        // Verify output
        String expectedOutput = "Hello, Maven World!" + System.lineSeparator() +
                              "Hello, Alice!" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());

        
    }
}
