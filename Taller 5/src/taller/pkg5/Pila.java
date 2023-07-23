/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg5;

/**
 *
 * @author josep
 */
public class Pila {

    private int cima;
    private int vectorPila[];

    public Pila(int tamano) {
        vectorPila = new int[tamano];
        cima = 0;
    }

    public int getCima() {
        return cima;
    }

    public void setCima(int cima) {
        this.cima = cima;
    }

    public int[] getVectorPila() {
        return vectorPila;
    }

    public void setVectorPila(int[] vectorPila) {
        this.vectorPila = vectorPila;
    }

    public void push(int dato) {
        vectorPila[cima] = dato;
        setCima(getCima() + 1);
    }

    public int pop() {
        int eliminar = 0;
        if (getCima() == 0) {
            System.out.println("pila vacia");
        } else {
            eliminar = vectorPila[cima - 1];
            setCima(getCima() - 1);
        }
        return eliminar;
    }

    public int tamano() {
        return vectorPila.length;
    }

    public boolean pilaVacia() {
        return getCima() == 0;
    }

    public boolean pilaLlena(int tamano) {
        return getCima() == tamano();
    }

    public void mostrarPila() {
        if (pilaVacia()) {
            System.out.println("Pila Vacia");
        } else {
            for (int i = getCima() - 1; i >= 0; i--) {
                System.out.println(vectorPila[i]);
            }
        }
    }

    public void extFondo() {
        int aux = 0;
        while (pilaVacia() == false) {
            aux = pop();
        }
        System.out.println(aux);
    }

    public void pasarDatos() {
        int aux;
        Pila pilaDos = new Pila(tamano());
        while (!pilaVacia() && !pilaDos.pilaLlena(tamano())) {
            aux = pop();
            pilaDos.push(aux);
            if (pilaDos.pilaLlena(tamano())) {
                System.out.println("Esta llena");
            }
        }
    }

}
