import java.util.Scanner;
import java.util.InputMismatchException;

public class DemoExcepciones
{
    public static void main() throws MiPropiaException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        while(true) {
            try {
                int n = entrada.nextInt();
                if( n >= 9 ) {
                    throw new MiPropiaException("El valor de n debe ser menor o igual a 10");
                }
                System.out.println("El número ingresado es: " + n);
                break;
            } catch(InputMismatchException e) {
                System.out.println("TE DIJE QUE INGRESARAS UN ENTERO!!");
                System.out.print("Va de nuevo, ingresa un entero: ");
                entrada.nextLine();
            }
        }
    }
    
}
