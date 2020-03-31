public class Avion extends Vehiculo implements Volador
{
    public Avion(String m, String c) {
        super(m,c);
    }
    
    @Override
    public String virar(String d) {
        return "";
    }
    
    @Override
    public String acelerar(int u) {
        return "";
    }
    
    @Override
    public String desacelerar(int u) {
        return "";
    }
    
    @Override
    public String ascender(int unidades) {
        return "Avión ganando altura en "+unidades +" metros";
    }
    
    @Override
    public String descender(int unidades) {
        return "Avión perdiendo altura en "+unidades + " metros";
    }
}
