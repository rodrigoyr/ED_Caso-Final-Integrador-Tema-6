package Gestion_de_Datos_Dinamicos;

public class Pareja {
    private int elemento1;
    private int elemento2;

    // Constructor
    public Pareja(int elemento1, int elemento2) {
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
    }

    // Getters
    public int getElemento1() {
        return this.elemento1;
    }

    public int getElemento2() {
        return this.elemento2;
    }

    // Setters
    public void setElemento1(int elemento1) {
        this.elemento1 = elemento1;
    }

    public void setElemento2(int elemento2) {
        this.elemento2 = elemento2;
    }
}