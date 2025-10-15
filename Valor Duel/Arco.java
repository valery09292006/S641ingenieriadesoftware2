import java.util.Random;

// ===================================================
// CLASE ARCO (hereda de Arma)
// Daño más constante y con menos variación
// ===================================================
public class Arco extends Arma {
    public Arco() {
        super("Arco", 10, 25);
    }

    @Override
    public int generarDaño() {
        Random rand = new Random();
        return rand.nextInt((dañoMaximo - dañoMinimo) + 1) + dañoMinimo;
    }
}
