package modelos;

import java.util.LinkedList;

public class Compra {
    private float precioCompra;
    private int cantidadProductosComprados;
    private LinkedList<Producto> productosComprados;

    public Compra(){
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public int getCantidadProductosComprados() {
        return cantidadProductosComprados;
    }

    public LinkedList<Producto> getProductosComprados() {
        return productosComprados;
    }
    
    public void calcularProductosComprados(){
        this.cantidadProductosComprados = this.productosComprados.size();
    }
    
    public void calcularPrecioCompra(){
        float precioTotalCompra = 0;
        
        for (Producto producto: this.productosComprados) {
            precioTotalCompra += producto.getPrecio();
        }
        
        this.precioCompra = precioTotalCompra;
    }
    
    public void comprarProducto(Producto producto){
        this.productosComprados.add(producto);
    }
}
