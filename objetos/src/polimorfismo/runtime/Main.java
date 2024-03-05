package polimorfismo.runtime;

class Forma {
    public void dibujar() {
        System.out.println("Dibujando una forma");
    }
}

class Circulo extends Forma {
    @Override
    public void dibujar() {
        System.out.println("⚫");
    }
}

class Cuadrado extends Forma {
    @Override
    public void dibujar() {
        System.out.println("\uD83D\uDD33");
    }
}

public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[3]; // Crea un arreglo de tipo Forma

        formas[0] = new Forma();       // Agrega una instancia de Forma
        formas[1] = new Circulo();     // Agrega una instancia de Circulo
        formas[2] = new Cuadrado();    // Agrega una instancia de Cuadrado

        for(Forma forma : formas) {
            forma.dibujar(); // Llama al método dibujar de cada objeto en el arreglo
        }
    }
}
