

/**
 *
 * @author molgu
 */
public class ClasePrincipal {

    public static void main() {
        Auto auto = new Auto("Ford","Negro");
        Barco barco = new Barco("Beneteau","Blanco");
        
        Vehiculo vehiculo = barco;
        System.out.println(vehiculo.virar("babor"));
        
        vehiculo=auto;
        System.out.println(vehiculo.virar("izquierda"));
        
        System.out.print(auto.acelerar(10) + " ");
        System.out.println(barco.acelerar(5));
        
    }
    
}
