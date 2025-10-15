
// ===================================================
// CLASE ABSTRACTA: Entidad (superclase base)
// Representa cualquier ser con nombre y puntos de vida.
// ===================================================
abstract class Entidad {
    protected String nombre;
    protected int puntosDeVida;

    public Entidad(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
    }

    public void recibirDaño(int daño) {
        this.puntosDeVida -= daño;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }
}
