import java.util.ArrayList;
import java.util.List;

public class Impresion extends Producto {
    private String color;
    private List<Foto> fotos;
    
    // Constructor
    public Impresion(String color, List<Foto> fotos) {
        super();
        this.color = color;
        this.fotos = new ArrayList<>(fotos); // Copia defensiva
    }
    
    // Implementación del método abstracto
    @Override
    public void print() {
        System.out.println("Impresión #" + numero + " (" + color + ") con " + 
                          fotos.size() + " fotos:");
        for (Foto foto : fotos) {
            System.out.println("  - " + foto.getFichero());
        }
    }
    
    // Getters
    public String getColor() {
        return color;
    }
    
    public List<Foto> getFotos() {
        return new ArrayList<>(fotos); // Copia defensiva
    }
}