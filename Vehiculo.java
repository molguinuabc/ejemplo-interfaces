
/**
 * Estructura y comportamiento base de todo tipo de vehículo
 * @author molguin
 */
public abstract class Vehiculo {
    private String marca;
    private String color;
    
    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }
    
    /**
     * Selector de marca
     * @return marca del Vehiculo
    */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Selector de color
     * @return color del Vehiculo
    */
    public String getColor() {
        return color;
    }

    /**
     * Mutador de color
     * @param color string que indica el color a establecer 
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Activa el sistema de propulsión del vehiculo
     * @param unidades valor de incremento en velocidad
     * @return cadena con la operación realizada
    */
    public abstract String acelerar(int unidades);
    
    /**
     * Activa el sistema de frenado del vehiculo
     * @param unidades valor a decrementar la  velocidad
     * @return cadena con la operación realizada
    */
    
    public abstract String desacelerar(int unidades);
    
    /**
     * Activa el sistema de giro del vehiculo
     * @param rumbo nueva dirección
     * @return cadena con la operación realizada
    */
    public abstract String virar(String direccion);
    
}
