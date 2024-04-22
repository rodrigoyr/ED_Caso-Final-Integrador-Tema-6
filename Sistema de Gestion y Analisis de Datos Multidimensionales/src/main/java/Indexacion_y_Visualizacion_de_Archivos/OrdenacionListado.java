package Indexacion_y_Visualizacion_de_Archivos;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacionListado {
    private List<File> archivosIndexados;

    // Constructor
    public OrdenacionListado(List<File> archivosIndexados) {
        this.archivosIndexados = archivosIndexados;
    }

    // Método para ordenar los archivos por nombre
    public void ordenarPorNombre() {
        Collections.sort(archivosIndexados, Comparator.comparing(File::getName));
    }

    // Método para ordenar los archivos por tamaño
    public void ordenarPorTamano() {
        Collections.sort(archivosIndexados, Comparator.comparing(File::length));
    }

    // Método para obtener la lista de archivos indexados
    public List<File> obtenerArchivosIndexados() {
        return this.archivosIndexados;
    }
}