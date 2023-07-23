/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg5;

/**
 *
 * @author josep
 */
public class Cola {

    private NodoCola inicio, fin;
    private int tama;

    public Cola(NodoCola inicio, NodoCola fin, int tama) {
        this.inicio = inicio;
        this.fin = fin;
        this.tama = tama;
    }

    public NodoCola getInicio() {
        return inicio;
    }

    public void setInicio(NodoCola inicio) {
        this.inicio = inicio;
    }

    public NodoCola getFin() {
        return fin;
    }

    public void setFin(NodoCola fin) {
        this.fin = fin;
    }

    public int getTama() {
        return tama;
    }

    public void setTama(int tama) {
        this.tama = tama;
    }
    public void limpiarCola() {
        setInicio(null);
        setFin(null);
        setTama(0);
    }

    public boolean ColaVacia() {
        return inicio == null;
    }

    public void insertar(int ele) {
        NodoCola nuevo = new NodoCola(ele);
        if (ColaVacia()) {
            setInicio(nuevo);
        } else {
            getFin().setSiguiente(nuevo);
        }
        setFin(nuevo);
        setTama(getTama()+1);
    }

    public int eliminar() {
        int aux = getInicio().getDato();
        setInicio(getInicio().getSiguiente());
        setTama(getTama()-1);
        return aux;
    }

    public int inicioCola() {
        return getInicio().getDato();
    }
    public int finCola(){
        return getFin().getDato();
    }

    public int tamanoCola() {
        return getTama();
    }
    
    public void mostrarCola(){
        while (!ColaVacia()) {            
            int aux = inicioCola();
            eliminar();
            System.out.println(aux);
        }
    }
    public void mostrarColaDos(){
        NodoCola recorrido= inicio;
        while (recorrido != null) {            
            System.out.println(recorrido.getDato());
            recorrido=recorrido.getSiguiente();
        }
    }

}
