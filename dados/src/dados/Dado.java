package dados;

import java.util.Random;

/**
 *
 */
public class Dado {

    /**
     * Default constructor
     */
    public Dado() {
        this(6);
    }

    public Dado(int caras) {
        setCaras(caras);
    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    /**
     *
     */
    private int caras;

    /**
     * @return
     */
    public int lanzar() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "dados.Dado{" +
                "caras=" + caras +
                '}';
    }
}