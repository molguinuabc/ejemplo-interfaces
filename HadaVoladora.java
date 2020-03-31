public class HadaVoladora implements Volador
{
    private int tamañoDeAlas;
   
    public HadaVoladora(int tamaño)
    {
        this.tamañoDeAlas = tamaño;
       
    }
    
    public int getTamañoDeAlas() {
        return this.tamañoDeAlas;
    }
    
    @Override
    public String ascender(int u) {
        return "Hada batiendo sus alitas para ascender " + u + " centimetros";
    }
    
    @Override
    public String descender(int u) {
        return "Hada dejando de batir sus alitas para descender " +
        u + " centimetros";
    }
}
