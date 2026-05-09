package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {
    
    @Test
    void checkRes(){    
       String expected = 
        "  I    I    I  \n" +
        "  I    I    I  \n" +
        "  I    I    I  \n" +
        "  I    I    I  \n" +
        "  I    I    I  \n" +
        "  I    I    I  \n";

    String result = RomanPrinter.print(3);

    assertEquals(expected, result, "La stampa di III non corrisponde al formato atteso");
    }   


}
