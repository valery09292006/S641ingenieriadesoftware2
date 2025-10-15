import java.util.Random;

// ===================================================
// CLASE LANZA (hereda de Arma)
// Daño equilibrado con ligero aumento en daño mínimo
// ===================================================
public class Lanza extends Arma {
    public Lanza() {
        super("Lanza", 14, 28);
    }

    @Override
    public int generarDaño() {
        Random rand = new Random();
        return rand.nextInt((dañoMaximo - dañoMinimo) + 1) + dañoMinimo;
    }
}
