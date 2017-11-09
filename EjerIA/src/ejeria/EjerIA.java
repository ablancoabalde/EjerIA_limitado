
package ejeria;

import java.util.Scanner;

public class EjerIA {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner (System.in);
      Pedir ped = new Pedir ();
      
        System.out.println("¿Cómo te llamas, querido compañero?");
        String nom = sc.nextLine();
        ped.pedirDatos(nom);
        
        
    }
    
}
