import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Tarea11
{
    public static void main() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<HashMap<String,String>> lista = new ArrayList<>();
        System.out.print("Ingresa el número de personas a registrar en el directorio: ");
        int n = entrada.nextInt();
        entrada.nextLine();
        String nombre;
        String direccion;
        String telefono;
        for(int i = 0; i<n ; i++) {
            System.out.println("Ingresa los datos de la persona "+(i+1));
            System.out.print("Nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Direccion: ");
            direccion = entrada.nextLine();
            System.out.print("Teléfono: ");
            telefono = entrada.nextLine();
            HashMap<String,String> hm = new HashMap<>();
            hm.put("nombre",nombre);
            hm.put("direccion",direccion);
            hm.put("telefono",telefono);
            lista.add(hm);
        }
        System.out.println("\nDespliegue del contenido del directorio:");
        lista.forEach( e ->{
            e.forEach((k,v) -> {
                System.out.println(k.substring(0,1).toUpperCase()+
                k.substring(1) +": "+v);
            });
            System.out.println();
        });
    }
}
