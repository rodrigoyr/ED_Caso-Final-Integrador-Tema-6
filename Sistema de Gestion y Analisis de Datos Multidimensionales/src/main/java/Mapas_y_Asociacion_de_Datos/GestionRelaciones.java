package Mapas_y_Asociacion_de_Datos;

import Gestion_de_Datos_Dinamicos.Pareja;
import java.util.HashMap;
import java.util.Map;

public class GestionRelaciones {
    private Map<Pareja, Pareja> relaciones;

    // Constructor
    public GestionRelaciones() {
        this.relaciones = new HashMap<>();
    }

    // Método para agregar una relación
    public void agregarRelacion(Pareja pareja1, Pareja pareja2) {
        this.relaciones.put(pareja1, pareja2);
    }

    // Método para obtener una relación
    public Pareja obtenerRelacion(Pareja pareja) {
        return this.relaciones.get(pareja);
    }

    // Método para eliminar una relación
    public void eliminarRelacion(Pareja pareja) {
        this.relaciones.remove(pareja);
    }
}