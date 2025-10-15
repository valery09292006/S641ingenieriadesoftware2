// ===================================================
// CLASE ABSTRACTA: Arma
// Define el comportamiento general de cualquier tipo de arma
// ===================================================
public abstract class Arma {
    protected String nombre;
    protected int dañoMinimo;
    protected int dañoMaximo;

    public Arma(String nombre, int dañoMinimo, int dañoMaximo) {
        this.nombre = nombre;
        this.dañoMinimo = dañoMinimo;
        this.dañoMaximo = dañoMaximo;
    }

    // Método que devuelve el daño aleatorio según el tipo de arma
    public abstract int generarDaño();

    public String getNombre() {
        return this.nombre;
    }
}

