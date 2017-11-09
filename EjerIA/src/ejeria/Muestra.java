
package ejeria;

public class Muestra {
    
    private Pedir ped = new Pedir();
    
    public Muestra(){
       
    }
   
    
    public String devuelveNombre(Pedir ped){
        return ped.getNombre();
    }
}
