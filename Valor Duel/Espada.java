import java.util.Random;

// ===================================================
// CLASE ESPADA (hereda de Arma)
// Daño balanceado, con un pequeño aumento de ataque
// ===================================================
public class Espada extends Arma {
    public Espada() {
        super("Espada", 12, 30);
    }

    @Override
    public int generarDaño() {
        Random rand = new Random();
        return rand.nextInt((dañoMaximo - dañoMinimo) + 1) + dañoMinimo;
    }
}
