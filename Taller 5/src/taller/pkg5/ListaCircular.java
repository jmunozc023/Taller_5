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
        NodoListaCircular nuevo = new NodoListaCircular();
        nuevo.dato = x;
        if (primero == null) {
            primero = nuevo;
            ultimo = primero;
            primero.siguiente = ultimo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
        }
    }

    public void verListaCircular() {
        NodoListaCircular actual = new NodoListaCircular();
        actual = primero;
        do {
            System.out.println(" " + actual.dato);
            actual = actual.siguiente;
        } while (actual != primero);
    }

    public void buscarCircular(int x) {
        NodoListaCircular actual = new NodoListaCircular();
        actual = primero;
        boolean encontrado = false;
        do {
            if (actual.dato == x) {
                encontrado = true;
            }
            actual = actual.siguiente;
        } while (actual != primero);
        if (encontrado == true) {
            System.out.println("encontrado");
        } else {
            System.out.println("no existe");
        }
    }

    public void eliminar(int dato) {
        NodoListaCircular actual = new NodoListaCircular();
        NodoListaCircular anterior = new NodoListaCircular();
        actual = primero;
        anterior = ultimo;
        do {
            if (actual.dato == dato) {
                if (actual == primero) {
                    primero = primero.siguiente;
                    ultimo.siguiente = primero;
                } else {
                    if (actual == ultimo) {
                        anterior.siguiente = ultimo.siguiente;
                        ultimo = anterior;
                    } else {
                        anterior.siguiente = actual.siguiente;
                    }
                }
            }
            anterior = actual;
            actual = actual.siguiente;
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
