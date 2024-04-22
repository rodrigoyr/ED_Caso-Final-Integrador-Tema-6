package Gestion_de_Datos_Dinamicos;

import java.util.Scanner;

public class InterfazUsuario {
    private ListaDatos listaDatos;
    private Scanner scanner;

    // Constructor
    public InterfazUsuario() {
        this.listaDatos = new ListaDatos();
        this.scanner = new Scanner(System.in);
    }

    // Método para solicitar datos al usuario
    public void solicitarDatos() {
        System.out.println("Introduce el primer elemento de la pareja:");
        int elemento1 = scanner.nextInt();
        System.out.println("Introduce el segundo elemento de la pareja:");
        int elemento2 = scanner.nextInt();
        Pareja pareja = new Pareja(elemento1, elemento2);
        listaDatos.agregarPareja(pareja);
    }

    // Método para mostrar datos al usuario
    public void mostrarDatos() {
        for (int i = 0; i < listaDatos.obtenerLista().size(); i++) {
            Pareja pareja = listaDatos.obtenerPareja(i);
            System.out.println("Pareja " + (i+1) + ": (" + pareja.getElemento1() + ", " + pareja.getElemento2() + ")");
        }
    }

    // Método para manejar las opciones de organización y filtrado
    // Este método es solo un placeholder, necesitarás implementar la lógica de organización y filtrado
    public void manejarOpciones() {
        System.out.println("Este método manejará las opciones de organización y filtrado");
    }
}