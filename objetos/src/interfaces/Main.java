package interfaces;

public class Main {
    public static void main(String[] args) {

         Forma f = new Cuadrado(10);
         Forma g = new Triangulo(2, 3);

        System.out.println("Cuadrado");
         calcular(f);
        System.out.println("Triangulo");
        calcular(g);

    }

    public static void calcular(Forma forma) {
        System.out.println("Perimetro: " + forma.perimetro());
        System.out.println("Area: " + forma.area());
    }
}
