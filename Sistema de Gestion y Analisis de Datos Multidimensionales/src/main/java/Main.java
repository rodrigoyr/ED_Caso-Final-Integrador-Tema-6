import Indexacion_y_Visualizacion_de_Archivos.IndexacionRecursiva;
import Indexacion_y_Visualizacion_de_Archivos.OrdenacionListado;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de IndexacionRecursiva
        IndexacionRecursiva indexacionRecursiva = new IndexacionRecursiva();

        // Indexar los archivos en un directorio específico
        indexacionRecursiva.indexarArchivos(new File("ruta/a/tu/directorio"));

        // Crear una instancia de OrdenacionListado con los archivos indexados
        OrdenacionListado ordenacionListado = new OrdenacionListado(indexacionRecursiva.obtenerArchivosIndexados());

        // Ordenar los archivos por nombre
        ordenacionListado.ordenarPorNombre();

        // Imprimir los archivos ordenados
        for (File archivo : ordenacionListado.obtenerArchivosIndexados()) {
            System.out.println(archivo.getName());
        }
    }
}