import dados.Juego;

public class Main {
    public static void main(String[] args) {
        // Obtener cuantos jugadores se crearan
        Juego juego = new Juego(2);
        // La partida deberia definir el tipo de juego: Max, Min, Numero, Pares
        juego.crearPartida();

    }
}
