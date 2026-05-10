package it.unipd.mtss;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testMainExecution() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            App.main(new String[]{});
                        String output = outContent.toString();
            assertTrue(output.length() > 0);
            assertTrue(output.contains("L")); 
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void testAppConstructor() {
      
        App app = new App();
        assertTrue(app instanceof App);
    }
}