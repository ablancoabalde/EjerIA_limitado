
package ejeria;

import java.util.Scanner;


public class Pedir {
    
Scanner sc = new Scanner (System.in);

public Pedir (){
    
}

public String pedirDatos (){
    System.out.println("Hola compañero, ¿cómo te llamas?");
    String nombre = sc.nextLine();
    return nombre;
}

}
