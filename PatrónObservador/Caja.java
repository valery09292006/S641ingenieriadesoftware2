// Observador concreto que representa la caja registradora
public class Caja implements Observador {
    @Override
    public void actualizar(String pedido) {
        System.out.println("Caja: registrando venta de " + pedido);
    }
}
