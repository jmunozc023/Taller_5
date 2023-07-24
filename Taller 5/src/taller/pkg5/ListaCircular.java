/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg5;

/**
 *
 * @author josep
 */
public class ListaCircular {

    private NodoListaCircular primero;
    private NodoListaCircular ultimo;

    public ListaCircular() {
        this.primero = null;
        this.ultimo = null;
    }

    public NodoListaCircular getPrimero() {
        return primero;
    }

    public void setPrimero(NodoListaCircular primero) {
        this.primero = primero;
    }

    public NodoListaCircular getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoListaCircular ultimo) {
        this.ultimo = ultimo;
    }
    
    public void ingresar(int x) {
        NodoListaCircular nuevo = new NodoListaCircular(x, primero);
        nuevo.setDato(x);
        if (primero == null) {
            primero = nuevo;
            ultimo = primero;
            primero.setSiguiente(ultimo);
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(primero);
            ultimo = nuevo;
        }
    }

    public void verListaCircular() {
        NodoListaCircular actual = primero;
        do {
            System.out.println(" " + actual.getDato());
            actual = actual.getSiguiente();
        } while (actual != primero);
    }

    public void buscarCircular(int x) {
        NodoListaCircular actual = primero;
        boolean encontrado = false;
        do {
            if (actual.getDato() == x) {
                encontrado = true;
            }
            actual = actual.getSiguiente();
        } while (actual != primero);
        if (encontrado) {
            System.out.println("encontrado");
        } else {
            System.out.println("no existe");
        }
    }

    public void eliminar(int dato) {
        NodoListaCircular actual = primero;
        NodoListaCircular anterior = ultimo;
        do {
            if (actual.getDato() == dato) {
                if (actual == primero) {
                    primero = primero.getSiguiente();
                    ultimo.setSiguiente(primero);
                } else {
                    if (actual == ultimo) {
                        anterior.setSiguiente(ultimo.getSiguiente());
                        ultimo = anterior;
                    } else {
                        anterior.setSiguiente(actual.getSiguiente());
                    }
                }
            }
            anterior = actual;
            actual = actual.getSiguiente();
        } while (actual != primero);
    }
    /*public void pasar(lista l){
        nodoListaSimple actual = new nodoListaSimple();
        actual = l ;
        while (l.Vacia()==false) {            
            ingresar(l.primero);
            actual = actual.siguiente;            
        }
    }*/
}
