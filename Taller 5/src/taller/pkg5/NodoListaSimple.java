package taller.pkg5;

/**
 *
 * @author josep
 */
public class NodoListaSimple {
    private int dato;
    private NodoListaSimple siguiente;

    public NodoListaSimple(int dato, NodoListaSimple siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoListaSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaSimple siguiente) {
        this.siguiente = siguiente;
    }
    
}
