package taller.pkg5;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Menu {
    Scanner scanner = new Scanner(System.in);
    Cola cola = new Cola();
    Pila pila = new Pila(10);
    ListaSimple listaSimple = new ListaSimple();
    ListaDoble listaDoble = new ListaDoble();
    ListaCircular listaCircular = new ListaCircular();
    Funcionalidad funcionalidad = new Funcionalidad();
    int opcion;
    public void Menu (){
        do {            
            System.out.println("----- MENÚ -----");
            System.out.println("1. Pasar Datos de Cola a Pila");
            System.out.println("2. Pasar Datos de Una Pila a una Lista Doble");
            System.out.println("3. Pasar los datos de una Lista Simple a una Lista Circular");
            System.out.println("4. Ver la Cola con los datos que van a pasar");
            System.out.println("5. Ver la Pila cuando pasaron los datos");
            System.out.println("6. Ver la Lista Doble creada");
            System.out.println("7. Ver los datos de la Lista Simple cargada");
            System.out.println("8. Ver los datos de la Lista Circular que se pasaron");
            System.out.println("9. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    funcionalidad.LlenarCola(cola, 1);
                    funcionalidad.PasarColaAPila(cola, pila);
                    break;
                case 2:
                    funcionalidad.PasarPilaAListaDoble(pila, listaDoble);
                    break;
                case 3:
                    funcionalidad.LlenarListaSimple(listaSimple, 1);
                    funcionalidad.PasarListaSimpleAListaCircular(listaSimple, listaCircular);
                    break;
                case 4:
                    funcionalidad.MostrarCola(cola);
                    break;
                case 5:
                    funcionalidad.mostrarPila(pila);
                    break;
                case 6:
                    funcionalidad.MostrarListaDoble(listaDoble);
                    break;
                case 7:
                    funcionalidad.MostrarListaSimple(listaSimple);
                    break;
                case 8:
                    funcionalidad.MostrarListaCircular(listaCircular);
                    break;

            }
        } while (opcion != 9);
        System.out.println("Opcion incorrecta. Intente de nuevo.");
    }
}
