public class FotoFactory extends ProductoFactory {
    private String marca;
    private String modelo;
    
    // Constructor
    public FotoFactory(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Método específico para crear Fotos
    public Foto crearProducto(String fichero) {
        return new Foto(fichero, marca, modelo);
    }
    
    // Implementación del método abstracto (versión básica)
    @Override
    public Producto crearProducto() {
        // Podría lanzar una excepción o crear una foto por defecto
        throw new UnsupportedOperationException(
            "Use crearProducto(String fichero) para Fotos");
    }
}