package taller.pkg5;

/**
 *
 * @author josep
 */
public class ListaDoble {

    private NodoListaDoble primero;
    private NodoListaDoble ultimo;

    public ListaDoble() {
        this.primero = primero;
        this.ultimo = ultimo;
    }

    public NodoListaDoble getPrimero() {
        return primero;
    }

    public void setPrimero(NodoListaDoble primero) {
        this.primero = primero;
    }

    public NodoListaDoble getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoListaDoble ultimo) {
        this.ultimo = ultimo;
    }

    public void ingresar(String nombre,int dato) {
        NodoListaDoble nodoNuevo = new NodoListaDoble();
        nodoNuevo.setNombre(nombre);
        nodoNuevo.setDato(dato);
        if (getPrimero()== null) {
            setPrimero(nodoNuevo);
            getPrimero().setSiguiente(null);
            getPrimero().setAnterior(null);
            setUltimo(nodoNuevo);
        } else {
            getUltimo().setSiguiente(nodoNuevo);
            nodoNuevo.setAnterior(getUltimo());
            nodoNuevo.setSiguiente(null);
            setUltimo(nodoNuevo);
        }
    }
    public void eliminar(String nombre,int dato){
        NodoListaDoble actual = new NodoListaDoble();
        NodoListaDoble anterior = new NodoListaDoble();
        actual= getPrimero();
        anterior = null;
        while (actual != null) {            
            if (actual.getDato()== dato) {
                if (actual== getPrimero()) {
                    setPrimero(getPrimero().getSiguiente());
                    getPrimero().setAnterior(null);
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
    }
    public void MostrarLista(){
        if (primero == null) {
            System.out.println("La lista esta vacia");
            return;
        }
        NodoListaDoble actual = new NodoListaDoble();
        actual= getPrimero();
        while (actual != null) {            
            System.out.println("Nombre: "+actual.getNombre() + " Numero: "+ actual.getDato());
            actual = actual.getSiguiente();
        }
    }

}
