////////////////////////////////////////////////////////////////////
// Daxin Chen 2148627
// Aurelio Rrena 2147993
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testMainConArgomentoValido() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            App.main(new String[]{"10"});
            String output = outContent.toString();
            assertTrue(output.contains("10"));
            assertTrue(output.contains("X")); 
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void testMainSenzaArgomenti() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            App.main(new String[]{});
            String output = outContent.toString();
            
            assertTrue(output.contains("67"));
            assertTrue(output.contains("L"));
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void testMainConArgomentoNonValido() {
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        PrintStream originalErr = System.err;
        System.setErr(new PrintStream(errContent));

        try {
            App.main(new String[]{"abc"});
            String output = errContent.toString();
            
            assertTrue(output.contains("Errore"));
        } finally {
            System.setErr(originalErr);
        }
    }

    @Test
    public void testAppConstructor() {
        App app = new App();
        assertTrue(app instanceof App);
    }
}