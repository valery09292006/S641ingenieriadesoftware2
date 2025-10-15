public class Foto extends Producto {
    private String fichero;
    private String marcaCamara;
    private String modeloCamara;
    
    // Constructor
    public Foto(String fichero, String marcaCamara, String modeloCamara) {
        super(); // Llama al constructor de Producto
        this.fichero = fichero;
        this.marcaCamara = marcaCamara;
        this.modeloCamara = modeloCamara;
    }
    
    // Implementación del método abstracto
    @Override
    public void print() {
        System.out.println("Foto #" + numero + ": " + fichero + 
                          " (Cámara: " + marcaCamara + " " + modeloCamara + ")");
    }
    
    // Getters
    public String getFichero() {
        return fichero;
    }
    
    public String getMarcaCamara() {
        return marcaCamara;
    }
    
    public String getModeloCamara() {
        return modeloCamara;
    }
}