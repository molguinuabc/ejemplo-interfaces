/**
 *
 * @author molgu
 */

import java.util.ArrayList;
import java.util.Scanner;
public class ClasePrincipal {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un booleno: ");
        boolean entero = sc.nextBoolean();
        sc.nextLine();
        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();
        System.out.print("Ingresa otro entero: ");
        int otroEntero = sc.nextInt();
        
        System.out.println(entero);
        System.out.println(cadena);
        System.out.println(otroEntero);
        
        /*
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
       */
       
    }
    
}
