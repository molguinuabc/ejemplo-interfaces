public class DemoArreglos
{
    
    public DemoArreglos(){
    }
    
    public static void main() {
        String [] arrCadenas = new String[10];
        arrCadenas[3] = "cadena3";        
        //System.out.println(arrCadenas.length);
        
        Integer[][] matrizEnteros = new Integer[10][5];
        matrizEnteros[0][0] = 4;
        matrizEnteros[0][1] = 9;
        matrizEnteros[1][0] = 3;
        
        System.out.println(matrizEnteros[1][0]);
        
    }

   
}
