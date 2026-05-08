////////////////////////////////////////////////////////////////////
// Daxin Chen 2148627
// Aurelio Rrena 2147993
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {
    
    @Test
    void convertToThree(){    
        IntegerToRoman ir = new IntegerToRoman();
        String uno=ir.convert(1);
        assertEquals("I", uno); 

        String due=ir.convert(2);
        assertEquals("II", due);
        String tre=ir.convert(3);
        assertEquals("III", tre);
        assertNotEquals(uno, tre);
    }   


    @Test
    void convertFourToSix(){    
        IntegerToRoman ir = new IntegerToRoman();
        String quattro=ir.convert(4);
        assertEquals("IV", quattro);
        
        String cinque = ir.convert(5);
        assertEquals("V", cinque);
        
        String sei = ir.convert(6);
        assertEquals("VI", sei);
   
    }
    
    @Test
    void convertSevenToTen() {    
        IntegerToRoman ir = new IntegerToRoman();
        String sette = ir.convert(7);
        assertEquals("VII", sette);
        
        String otto = ir.convert(8);
        assertEquals("VIII", otto);
        
        String nove = ir.convert(9);
        assertEquals("IX", nove);
        
        String dieci = ir.convert(10);
        assertEquals("X", dieci);
    }
    
    
    @Test
    void testConvert_ShouldThrowException_WhenInputIsZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(0);
        });
    }

    @Test
    void testConvert_ShouldThrowException_WhenInputIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(-1);
        });
    }
    
}
