package taller.pkg5;

/**
 *
 * @author josep
 */
public class NodoListaCircular {
    int dato;
    NodoListaCircular siguiente;

    public NodoListaCircular(int dato, NodoListaCircular siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoListaCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaCircular siguiente) {
        this.siguiente = siguiente;
    }
    
}
