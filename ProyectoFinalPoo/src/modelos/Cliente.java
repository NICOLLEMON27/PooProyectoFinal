package modelos;

public class Cliente extends Persona{
    private Compra compra;
    private Direccion direccion;
    
    public Cliente(String nombre, String cedula, String años) {
        super(nombre, cedula, años);
    }

    public Compra getCompra() {
        return compra;
    }

    public void asignarCompra(Compra compra) {
        this.compra = compra;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void asignarDireccion(String calle, String ciudad) {
        this.direccion = new Direccion(calle, ciudad);
    }
    
    public String realizarPago(){
        return "Pago realizado de "+this.obtenerPrecioAPagar();
    }
    
    public String obtenerPrecioAPagar(){
        return this.compra.getPrecioCompra()+"";
    }
}
