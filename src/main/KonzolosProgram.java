
package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class KonzolosProgram {
   
    
    public static void main(String[] args) throws IOException {
        String tartalom = Files.readString(Path.of("versenyzok.txt"));
                System.out.println("A beolvasott fájl tartalma: ");
                System.out.println(tartalom);
        
    }

 
    
}
