package modelos;

public class Pastel extends Producto{
    private String sabor;
    private String tipoPastel;
    private String cobertura;

    public Pastel(String sabor, String tipoPastel, String cobertura, String nombre, float precio) {
        super(nombre, precio);
        this.sabor = sabor;
        this.tipoPastel = tipoPastel;
        this.cobertura = cobertura;
    }

    public String getSabor() {
        return sabor;
    }

    public String getTipoPastel() {
        return tipoPastel;
    }

    public String getCobertura() {
        return cobertura;
    }

    @Override
    public String hornearse() {
        return "Se está horneando un Pastel";
    }

    @Override
    public String retirarDelHorno() {
        return "El pastel está listo y ya se retiró del horno";
    }
    
}
