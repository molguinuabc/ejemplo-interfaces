

/**
 * Clase especializada que implementa los métodos abstractos
 * @author molguin
 * @see Vehiculo
 */
public class Auto extends Vehiculo{

    Auto(String marca, String color) {
        super(marca,color);
    }
    
    @Override
    public String virar(String direccion) {
        return "El Auto se dirije hacia la " + direccion +
                " ajustando las llantas";
    }
    
    @Override
    public String acelerar(int unidades) {
        return "Auto está revolucionando el motor y diferencial "+
                "para acelerar "+unidades + "km/hr";
    }

    @Override
    public String desacelerar(int unidades) {
        return "El auto está disminuyendo las revoluciones del motor "+
                "para desacelerar " + unidades + "km/hr";
    }
}
