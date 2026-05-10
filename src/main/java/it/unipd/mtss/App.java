package it.unipd.mtss;


public class App {
    public static void main(String[] args) {
        int numberToPrint = 50;
        
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