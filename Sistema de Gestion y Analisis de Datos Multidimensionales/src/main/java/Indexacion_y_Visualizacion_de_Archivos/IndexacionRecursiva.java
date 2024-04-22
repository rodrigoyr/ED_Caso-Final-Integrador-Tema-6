package Indexacion_y_Visualizacion_de_Archivos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IndexacionRecursiva {
    private List<File> archivosIndexados;

    // Constructor
    public IndexacionRecursiva() {
        this.archivosIndexados = new ArrayList<>();
    }

    // Método para indexar archivos de manera recursiva
    public void indexarArchivos(File directorio) {
        // Si el archivo es un directorio, indexamos recursivamente
        if (directorio.isDirectory()) {
            for (File archivo : directorio.listFiles()) {
                indexarArchivos(archivo);
            }
        } else {
            // Si el archivo no es un directorio, lo añadimos a la lista de archivos indexados
            archivosIndexados.add(directorio);
        }
    }

    // Método para obtener la lista de archivos indexados
    public List<File> obtenerArchivosIndexados() {
        return this.archivosIndexados;
    }
}