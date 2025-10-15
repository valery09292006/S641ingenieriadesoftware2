import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private Date fecha;
    private String numeroTarjetaCredito;
    
    // Constructor
    public Pedido(Cliente cliente, String numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.fecha = new Date(); // Fecha actual
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }
    
    // Agregar producto al pedido
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    // Mostrar información completa del pedido
    public void mostrarPedido() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println("=== PEDIDO ===");
        System.out.println(cliente);
        System.out.println("Fecha: " + sdf.format(fecha));
        System.out.println("Productos:");
        
        for (Producto producto : productos) {
            producto.print(); // Polimorfismo en acción
        }
        
        System.out.println("Total productos: " + productos.size());
        System.out.println("==============");
    }
    
    // Getters
    public Cliente getCliente() {
        return cliente;
    }
    
    public List<Producto> getProductos() {
        return new ArrayList<>(productos); // Copia defensiva
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public String getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }
}