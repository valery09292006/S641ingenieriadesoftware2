// Observador concreto que representa el panel donde se muestran los pedidos
public class PanelPedidos implements Observador {
    @Override
    public void actualizar(String pedido) {
        System.out.println("📺 Panel de pedidos: mostrando '" + pedido + "' en pantalla.");
    }
}
