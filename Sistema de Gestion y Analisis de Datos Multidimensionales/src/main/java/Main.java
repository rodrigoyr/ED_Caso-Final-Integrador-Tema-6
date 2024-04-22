import Indexacion_y_Visualizacion_de_Archivos.IndexacionRecursiva;
import Indexacion_y_Visualizacion_de_Archivos.OrdenacionListado;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que proporcione un directorio para indexar
        System.out.println("Por favor, introduzca la ruta al directorio que desea indexar:");
        String directorio = scanner.nextLine();

        // Crear una instancia de IndexacionRecursiva
        IndexacionRecursiva indexacionRecursiva = new IndexacionRecursiva();

        // Indexar los archivos en el directorio proporcionado por el usuario
        indexacionRecursiva.indexarArchivos(new File(directorio));

        // Crear una instancia de OrdenacionListado con los archivos indexados
        OrdenacionListado ordenacionListado = new OrdenacionListado(indexacionRecursiva.obtenerArchivosIndexados());

        // Solicitar al usuario que elija cómo ordenar los archivos indexados
        System.out.println("¿Cómo le gustaría ordenar los archivos indexados? (1 = por nombre, 2 = por tamaño)");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            // Ordenar los archivos por nombre
            ordenacionListado.ordenarPorNombre();
        } else if (opcion == 2) {
            // Ordenar los archivos por tamaño
            ordenacionListado.ordenarPorTamano();
        } else {
            System.out.println("Opción no válida. Los archivos se ordenarán por nombre por defecto.");
            ordenacionListado.ordenarPorNombre();
        }

        // Imprimir los archivos ordenados
        for (File archivo : ordenacionListado.obtenerArchivosIndexados()) {
            System.out.println(archivo.getName());
        }

        scanner.close();
    }
}