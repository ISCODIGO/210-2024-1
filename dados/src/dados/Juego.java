package dados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Juego {
    private final int CANTIDAD_DADOS = 2;
    private Dado[] dados;
    private ArrayList<Jugador> jugadores;

    public Juego(int cantidadJugadores) {
        Scanner entrada = new Scanner(System.in);

        // Inicializacion del array
        dados = new Dado[CANTIDAD_DADOS]; // {null, null}
        for(int i = 0; i < dados.length; i++) {
            dados[i] = new Dado();
        }

        // inicializacion de List
        jugadores = new ArrayList<>();
        for (int i = 0; i < cantidadJugadores; i++) {
            System.out.printf("Escriba el nombre del jugador [%d]: ", i);
            String nombre = entrada.next();
            jugadores.add(new Jugador(nombre));
        }
    }

    public int[] lanzarDadosArray() {
        int[] totales = new int[dados.length];

        for (int i = 0; i < dados.length; i++) {
            totales[i] = dados[i].lanzar();
        }

        return totales;
    }

    public int lanzarDados() {
        int total = 0;

        for (int i = 0; i < dados.length; i++) {
            total += dados[i].lanzar();
        }

        return total;
    }

    public void crearPartida() {
        /*
        1. Tomar el nombre del jugador.
        2. Lanzar el dado para el jugador.
        3. Almacenar el puntaje en el jugador
        4. Finalizar el ciclo.
        5. Determinar el ganador.
         */

        for (var jugador : jugadores) {
            System.out.printf("Turno de: %s%n", jugador.getNombre());
            int resultado = lanzarDados();
            System.out.println("\t" + resultado);
            jugador.setPuntaje(resultado);
        }
        Jugador ganador = getGanador();
        System.out.println("El ganador es: " + ganador);
    }

    public Jugador getGanador() {
        Jugador g = jugadores.getFirst();

        for (var jugador: jugadores) {
            if (jugador.getPuntaje() > g.getPuntaje()) {
                g = jugador;
            }
        }

        return g;
    }

}
