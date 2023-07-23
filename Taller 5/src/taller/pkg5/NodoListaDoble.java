package taller.pkg5;

/**
 *
 * @author josep
 */
public class NodoListaDoble {
    private int dato;
    private NodoListaDoble siguiente;
    private NodoListaDoble anterior;

    public NodoListaDoble() {
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoListaDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaDoble anterior) {
        this.anterior = anterior;
    }
    
}
