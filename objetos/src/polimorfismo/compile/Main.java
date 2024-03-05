package polimorfismo.compile;

class Operacion {
    // Método para sumar dos números
    public int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga del método sumar para sumar tres números
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Operacion op = new Operacion();

        System.out.println(op.sumar(5, 10)); // Llama al primer método
        System.out.println(op.sumar(5, 10, 15)); // Llama al segundo metodo
    }
}

