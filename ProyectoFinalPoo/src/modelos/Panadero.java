package modelos;

import java.util.LinkedList;
//en esta clase añadi GetCgehPanader,Getpanaderos y en el constructor inicalice panaderos,y los set
public class Panadero extends Persona{
    private LinkedList<Producto> productos;
    private LinkedList<Panadero> panaderos;
    private Panadero chefPanadero;

    public Panadero(String nombre, String cedula, String años) {
        super(nombre, cedula, años);
        this.chefPanadero = null;
        this.productos = new LinkedList();
        this.panaderos =new LinkedList();
    }
    
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public void agregarJefe(Panadero chefPanadero){
        this.chefPanadero = chefPanadero;
    }
    
    public void contratarPanadero(Panadero panadero){
        this.panaderos.add(panadero);
        panadero.agregarJefe(this);
    }

    public Panadero getChefPanadero() {
        return chefPanadero;
    }

    public LinkedList<Panadero> getPanaderos() {
        return panaderos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setAños(String años) {
        this.años = años;
    }
}
