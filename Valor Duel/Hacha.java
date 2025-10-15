import java.util.Random;

// ===================================================
// CLASE HACHA (hereda de Arma)
// Mayor daño máximo pero menos precisión (más variable)
// ===================================================
public class Hacha extends Arma {
    public Hacha() {
        super("Hacha", 8, 35);
    }

    @Override
    public int generarDaño() {
        Random rand = new Random();
        return rand.nextInt((dañoMaximo - dañoMinimo) + 1) + dañoMinimo;
    }
}