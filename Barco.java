

/**
 *
 * @author molgu
 */
public class Barco extends Vehiculo{

    Barco(String marca, String color) {
        super(marca,color);
    }
    
    @Override
    public String virar(String direccion) {
        return "El barco está moviendo el timón para virar hacia "+
                direccion;
    }
    
    @Override
    public String acelerar(int unidades) {
        return "Barco está acelerando la propela para aumentar la velocidad "+
                unidades + " nudos";
    }

    @Override
    public String desacelerar(int unidades) {
        return "Barco está desacelerando propela para disminuir la velocidad "+
                unidades + " nudos";
    }
}
