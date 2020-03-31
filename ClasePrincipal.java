/**
 *
 * @author molgu
 */

import java.util.ArrayList;

public class ClasePrincipal {

    public static void main() {
        
       Avion a = new Avion("Boeing","Plata");
       Pajaro p = new Pajaro("graznido");
       HadaVoladora h = new HadaVoladora(5);
              
       ArrayList<Volador> listaVoladores = new ArrayList<>();
       listaVoladores.add(a);
       listaVoladores.add(p);
       listaVoladores.add(h);
       int unidades = 0;
       for(Volador ov : listaVoladores) {
           switch(ov.getClass().getName()) {
               case "Avion":
               case "HadaVoladora":
                    unidades = 100;
                    break;
               case "Pajaro":
                    unidades = 10;
                    break;
           }
           System.out.println(ov.descender(unidades));
       }
       
       
       
    }
    
}
