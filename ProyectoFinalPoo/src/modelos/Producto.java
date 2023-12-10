package modelos;

public class Producto implements Hornear, Retirar{
    protected String nombre;
    protected float precio;

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String hornearse() {
        return "Se está horneando un producto";
    }

    @Override
    public String retirarDelHorno() {
        return "El producto ya está listo y ya se retiró del horno";
    }
    
}
