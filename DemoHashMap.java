import java.util.HashMap;
import java.util.ArrayList;

public class DemoHashMap
{
    
    public DemoHashMap(){
    }
    
    public static void main() {
        HashMap<Barco,Avion> hm = new HashMap<>();
        Barco b = new Barco("M1","rojo");
        Barco b2 = new Barco("M2","azul");
        
        hm.put(b,new Avion("MA1","plata"));
        hm.put(b2,new Avion("MA2","verde"));
        System.out.println(hm.get(b2).getMarca());
        
        hm.forEach((barco,avion) ->{
            System.out.println(barco.getMarca() + ":" +avion.getColor());
        });
        
        ArrayList<String> a = new ArrayList<>();
        a.add("cadena1");
        a.add("cadena2");
        a.add("cadena3");
        a.add("cadena4");
        
        a.forEach( c -> {
            System.out.println(c);
        });
    }

   
}
