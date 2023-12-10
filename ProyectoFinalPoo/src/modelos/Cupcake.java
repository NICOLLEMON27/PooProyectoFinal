package modelos;

public class Cupcake extends Producto{
    
    
    private String sabor;

    public Cupcake(String sabor, String nombre, float precio) {
        super(nombre, precio);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    @Override
    public String hornearse() {
        return "Se está horneando un Cupcake";
    }

    @Override
    public String retirarDelHorno() {
        return "El Cupcake está listo y ya se retiró del horno";
    }
    
}
