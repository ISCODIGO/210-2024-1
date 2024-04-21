package org.example.pruebagui;

public class Poligono {
    private int lados;
    private double[] ejeX;
    private double[] ejeY;
    private int indice;

    public Poligono(int lados) {
        this.lados = lados;
        this.ejeX = new double[this.lados];
        this.ejeY = new double[this.lados];
        this.indice = -1;
    }

    public double[] getEjeX() {
        return ejeX;
    }

    public int getLados() {
        return lados;
    }

    public double[] getEjeY() {
        return ejeY;
    }

    public void agregarPunto(double x, double y) {
        if (this.indice >= this.ejeX.length - 1) {
            return;
        }
        this.indice ++;
        this.ejeX[indice] = x;
        this.ejeY[indice] = y;
    }

    public boolean estaListo() {
        return this.indice >= this.ejeX.length - 1;
    }

    public int getPuntos() {
        return this.indice + 1;
    }
}
