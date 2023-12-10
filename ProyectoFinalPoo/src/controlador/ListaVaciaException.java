
package controlador;


public class ListaVaciaException extends  Exception{
    public ListaVaciaException(String lista) {
        super("La lista " + lista + " está vacía.");
    }
}
