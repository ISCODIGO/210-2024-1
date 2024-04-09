package interfaces;

import com.sun.security.jgss.GSSUtil;

public class Triangulo implements Forma {
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    private int base;
    private int altura;
    @Override
    public void dibujar() {
        System.out.println("Triangulo");
    }

    @Override
    public double perimetro() {
        double cateto = Math.sqrt(
                Math.pow(base / 2.0, 2) + Math.pow(altura, 2)
        );

        return cateto * 2 * base;
    }

    @Override
    public double area() {
        return base * altura / 2.0;
    }
}
