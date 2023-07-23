package taller.pkg5;

/**
 *
 * @author josep
 */
public class ListaSimple {

    private NodoListaSimple primero;
    private NodoListaSimple ultimo;

    public ListaSimple() {
        primero = null;
        ultimo = null;
    }

    public NodoListaSimple getPrimero() {
        return primero;
    }

    public void setPrimero(NodoListaSimple primero) {
        this.primero = primero;
    }

    public NodoListaSimple getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoListaSimple ultimo) {
        this.ultimo = ultimo;
    }

    public boolean Vacia() {
        if (getPrimero() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void ingresarFinal(int dato) {

        NodoListaSimple nodoNuevo = new NodoListaSimple(dato, primero);
        nodoNuevo.setDato(dato);
        if (primero == null) {
            primero = nodoNuevo;
            primero.setSiguiente(null);
            ultimo = primero;
        } else {
            ultimo.setSiguiente(nodoNuevo);
            nodoNuevo.setSiguiente(null);
            ultimo = nodoNuevo;
        }
    }

    public void buscar(int dato) {
        NodoListaSimple actual = primero;
        actual = primero;
        while (actual != null) {
            if (actual.getDato() == dato) {
                System.out.println("nodo encontrado");
            }
            actual = actual.getSiguiente();
        }
    }

    public void eliminar(int dato) {
        if (primero == null) {
            System.out.println("La lista esta vacia");
            return;
        }
        NodoListaSimple actual = primero;
        NodoListaSimple anterior = null;
        while (actual != null) {
            if (actual.getDato() == dato) {
                if (actual == primero) {
                    primero = primero.getSiguiente();
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                }
                System.out.println("Nodo eliminado");
                return;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
        System.out.println("El dato no se encuentra en la lista");
    }

    public void imprimirLista() {
        NodoListaSimple auxiliar = primero;
        while (auxiliar != null) {
            System.out.println(auxiliar.getDato());
            auxiliar = auxiliar.getSiguiente();
        }
    }
}
