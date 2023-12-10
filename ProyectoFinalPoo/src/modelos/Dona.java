package modelos;

public class Dona extends Producto{
    private String relleno;
    private String glaceado;

    public Dona(String relleno, String glaceado, String nombre, float precio) {
        super(nombre, precio);
        this.relleno = relleno;
        this.glaceado = glaceado;
    }

    public String getRelleno() {
        return relleno;
    }

    public String getGlaceado() {
        return glaceado;
    }

    @Override
    public String hornearse() {
        return "Se está horneando una Dona";
    }

    @Override
    public String retirarDelHorno() {
        return "La Dona está lista y ya se retiró del horno";
    }
    
}
