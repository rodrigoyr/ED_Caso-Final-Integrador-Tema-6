package Gestion_de_Datos_Dinamicos;

import java.util.ArrayList;

public class ListaDatos {
    private ArrayList<Pareja> lista;

    // Constructor
    public ListaDatos() {
        this.lista = new ArrayList<>();
    }

    // Método para agregar una pareja a la lista
    public void agregarPareja(Pareja pareja) {
        this.lista.add(pareja);
    }

    // Método para eliminar una pareja de la lista
    public void eliminarPareja(Pareja pareja) {
        this.lista.remove(pareja);
    }

    // Método para obtener una pareja de la lista
    public Pareja obtenerPareja(int index) {
        return this.lista.get(index);
    }

    // Método para obtener la lista completa
    public ArrayList<Pareja> obtenerLista() {
        return this.lista;
    }
}