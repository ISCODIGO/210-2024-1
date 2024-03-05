package dados;

public class Jugador {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.juegosGanados = 0;
        this.puntaje = 0;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getJuegosGanados() {
        return juegosGanados;
    }

    public void setJuegosGanados(int juegosGanados) {
        this.juegosGanados = juegosGanados;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", this.getNombre(), this.getPuntaje());
    }

    private int puntaje;
    private int juegosGanados;
}
