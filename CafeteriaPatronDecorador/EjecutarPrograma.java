public class EjecutarPrograma {
    public static void main(String[] args) {

        System.out.println("=== Pedido 1: Café solo ===");
        Bebida pedido1 = new cafe();
        mostrarBebida(pedido1);

        System.out.println("\n=== Pedido 2: Café con leche y crema ===");
        Bebida pedido2 = new Crema(new Leche(new cafe()));
        mostrarBebida(pedido2);

        System.out.println("\n=== Pedido 3: Té con Canela ===");
        Bebida pedido3 = new Canela(new Te());
        mostrarBebida(pedido3);

        System.out.println("\n=== Pedido 4: Chocolate caliente con crema y chocolate extra ===");
        Bebida pedido4 = new ChocolateExtra(new Crema(new ChocolateCaliente()));
        mostrarBebida(pedido4);
    }

    private static void mostrarBebida(Bebida bebida) {
        System.out.println("Descripción: " + bebida.getDescripcion());
        System.out.println("Costo total: $" + bebida.getCosto());
    }
}
