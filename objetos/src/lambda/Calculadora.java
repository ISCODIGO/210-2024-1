package lambda;

public class Calculadora {
    public static void main(String[] args) {
        Calculable sumar = (double a, double b) -> { return a + b; };
        Calculable restar = (double a, double b) -> a - b;
        Calculable multiplicar = (a, b) -> a * b;
        Calculable dividir = (a, b) -> a / b;

        // Calcular una suma
        System.out.println(
                sumar.calcular(10, 20)
        );

        System.out.println("Resta: " + restar.calcular(4, 3));

    }
}
