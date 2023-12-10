package modelos;

public class Pan extends Producto{
    private String textura;

    public Pan(String textura, String nombre, float precio) {
        super(nombre, precio);
        this.textura = textura;
    }

    public String getTextura() {
        return textura;
    }

    @Override
    public String hornearse() {
        return "Se está horneando un Pan";
    }

    @Override
    public String retirarDelHorno() {
        return "El Pan está listo y ya se retiró del horno";
    }
    
    
}
