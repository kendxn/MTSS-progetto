////////////////////////////////////////////////////////////////////
// Daxin Chen 2148627
// Aurelio Rrena 2147993
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class App {
    public static void main(String[] args) {

        int numberToPrint;
        
        if (args.length > 0) {
            try {
                numberToPrint = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Errore: l'argomento fornito non è un numero valido.");
                return;
            }
        } else {
            numberToPrint = 67; // Default se non viene passato nulla
        }
        
        try {
            System.out.println("Numero arabo: " + numberToPrint);
            String asciiArt = RomanPrinter.print(numberToPrint);
            System.out.println("In formato Romano ASCII Art:");
            System.out.println(asciiArt);   
            
        } catch (IllegalArgumentException e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}