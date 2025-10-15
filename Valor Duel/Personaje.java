// ===================================================
// CLASE PERSONAJE (hereda de Entidad)
// Cada personaje tiene un arma y puede atacar
// ===================================================
public class Personaje extends Entidad {
    private Arma arma;

    public Personaje(String nombre, Arma arma) {
        super(nombre);
        this.arma = arma;
    }

    // Método para atacar a otro personaje
    public void atacar(Personaje oponente) {
        int daño = arma.generarDaño();
        oponente.recibirDaño(daño);
        System.out.println(nombre + " ataca con su " + arma.getNombre() + " a " +
                oponente.getNombre() + " causando " + daño + " puntos de daño.");
    }

    public Arma getArma() {
        return this.arma;
    }
}
