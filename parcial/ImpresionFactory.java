import java.util.List;

public class ImpresionFactory extends ProductoFactory {
    
    // Método específico para crear Impresiones
    public Impresion crearProducto(String color, List<Foto> fotos) {
        return new Impresion(color, fotos);
    }
    
    // Implementación del método abstracto (versión básica)
    @Override
    public Producto crearProducto() {
        // Podría lanzar una excepción o crear una impresión por defecto
        throw new UnsupportedOperationException(
            "Use crearProducto(String color, List<Foto> fotos) para Impresiones");
    }
}