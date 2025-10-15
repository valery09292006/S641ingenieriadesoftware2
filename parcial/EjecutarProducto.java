import java.util.Arrays;

public class EjecutarProducto {
    public static void main(String[] args) {
        // 1. Crear cliente
        Cliente cliente = new Cliente("1086045329", "Valery Perlaza");
        
        // 2. Crear factories (uso del patrón Factory Method)
        FotoFactory fotoFactory = new FotoFactory("Canon", "EOS R5");
        ImpresionFactory impresionFactory = new ImpresionFactory();
        
        // 3. Crear productos usando factories
        Foto foto1 = fotoFactory.crearProducto("vacaciones1.jpg");
        Foto foto2 = fotoFactory.crearProducto("vacaciones2.jpg");
        Foto foto3 = fotoFactory.crearProducto("familia.jpg");
        
        // 4. Crear impresión con algunas fotos
        Impresion impresion = impresionFactory.crearProducto(
            "Color", 
            Arrays.asList(foto1, foto2)
        );
        
        // 5. Crear pedido y agregar productos
        Pedido pedido = new Pedido(cliente, "****-****-****-6590");
        pedido.agregarProducto(foto1);
        pedido.agregarProducto(foto2);
        pedido.agregarProducto(foto3);
        pedido.agregarProducto(impresion);
        
        // 6. Mostrar el pedido completo
        pedido.mostrarPedido();
    }
}