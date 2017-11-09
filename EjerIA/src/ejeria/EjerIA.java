
package ejeria;

import java.util.Scanner;

public class EjerIA {

    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
        Muestra must = new Muestra();
        Pedir ped = new Pedir();
        System.out.println("¿Como te llamas?");
        ped.pedirNombre(entrada.nextLine());
        System.out.println("Encantado de conocerte " + must.devuelveNombre(ped));
       
    }
}
