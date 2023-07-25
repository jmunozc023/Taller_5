package taller.pkg5;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Funcionalidad {
    public void LlenarCola(Cola cola, int numero){
        if (numero > 10) {
            return;
        }
        cola.insertar(numero);
        LlenarCola(cola, numero+1);
    }
    public void MostrarCola (Cola cola){
        cola.mostrarCola();
    }
    public void PasarColaAPila(Cola cola, Pila pila){
        while (!cola.ColaVacia()) {            
            int dato = cola.eliminar();
            pila.push(dato);
        }
        System.out.println("Los datos de la cola han sido transferidos a la Pila");
    }
    public void mostrarPila(Pila pila){
        pila.mostrarPila();
    }
    public void PasarPilaAListaDoble(Pila pila, ListaDoble listaDoble) {
        Scanner scanner = new Scanner(System.in);
        while (!pila.pilaVacia()) {            
            int dato = pila.pop();
            System.out.println("Ingrese el nombre de la persona: ");
            String nombre = scanner.next();
            listaDoble.ingresar(nombre,dato);
        }
        System.out.println("Los datos de la Pila han sido transferidos a la Lista Doble");
    }
    public void MostrarListaDoble(ListaDoble listaDoble){
        listaDoble.MostrarLista();
    }
    public void LlenarListaSimple (ListaSimple listaSimple, int numero){
        if (numero >10) {
            return;
        }
        listaSimple.ingresarFinal(numero);
        LlenarListaSimple(listaSimple, numero+1);
    }
    public void MostrarListaSimple (ListaSimple listaSimple){
        listaSimple.imprimirLista();
    }
    public void PasarListaSimpleAListaCircular (ListaSimple listaSimple, ListaCircular listaCircular){
        NodoListaSimple actual = listaSimple.getPrimero();
        while (actual != null) {
            listaCircular.ingresar(actual.getDato());
            actual = actual.getSiguiente();
        }
        System.out.println("Los datos de la Lista Simple han sido transferidos a la Lista Circular");
    }
    public void MostrarListaCircular (ListaCircular listaCircular){
        listaCircular.verListaCircular();
    }
}
