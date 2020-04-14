import java.util.Scanner;
public class DemoScanner
{
    
    public DemoScanner(){
    }
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un booleano: ");
        boolean entero = sc.nextBoolean();
        sc.nextLine();
        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();
        System.out.print("Ingresa otro entero: ");
        int otroEntero = sc.nextInt();
        
        System.out.println(entero);
        System.out.println(cadena);
        System.out.println(otroEntero);
    }

   
}
