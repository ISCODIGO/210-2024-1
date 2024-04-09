package interfaces;

public class Cuadrado implements Forma {
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    private int lado;

    @Override
    public void dibujar() {
        System.out.println("Es un cuadrado");
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }
}
