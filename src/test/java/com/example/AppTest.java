
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testGreet() {
        // Test the greet() method
        assertEquals("Hello, Alice!", App.greet("Alice"));
        assertEquals("Hello, World!", App.greet("World"));
    }

    @Test
    void testMainOutput() {
        // Test main() method output (basic verification)
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        App.main(new String[]{});
        
        String expectedOutput = "Hello, Maven World!" + System.lineSeparator() +
                              "Hello, Alice!" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
