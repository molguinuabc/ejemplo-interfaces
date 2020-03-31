public class Pajaro implements Volador
{
    private String tonoDeCanto;
    
    public Pajaro(String tono) 
    {
       this.tonoDeCanto = tono;
    }
    
    public String getTonoDeCanto() {
        return this.tonoDeCanto;
    }
    
    @Override
    public String ascender(int u) {
        return "Pajaro ascendiendo " + u + " metros";
    }
    
    @Override
    public String descender(int u) {
        return "Pajaro descendiendo " + u + " metros";
    }

    
}
