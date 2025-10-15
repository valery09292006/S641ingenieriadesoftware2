public class Cliente {
    private String cedula;
    private String nombre;
    
    // Constructor
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
    
    // Getters
    public String getCedula() {
        return cedula;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Cliente: " + nombre + " (Cédula: " + cedula + ")";
    }
}