package Mapas_y_Asociacion_de_Datos;

import Gestion_de_Datos_Dinamicos.Pareja;
import java.util.Map;

public class RecuperacionEficiente {
    private Map<Pareja, Pareja> relaciones;

    // Constructor
    public RecuperacionEficiente(Map<Pareja, Pareja> relaciones) {
        this.relaciones = relaciones;
    }

    // Método para recuperar una relación de manera eficiente
    public Pareja recuperarRelacion(Pareja pareja) {
        return this.relaciones.get(pareja);
    }
}