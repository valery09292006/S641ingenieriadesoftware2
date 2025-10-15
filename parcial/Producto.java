public abstract class Producto {
    protected int numero;
    protected static int contador = 1;
    
    // Constructor
    public Producto() {
        this.numero = contador++;
    }
    
    // Getter
    public int getNumero() {
        return numero;
    }
    
    // Método abstracto que deben implementar las subclases
    public abstract void print();
}