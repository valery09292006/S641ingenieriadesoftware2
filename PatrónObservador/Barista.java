// Observador concreto que representa al barista
public class Barista implements Observador {
    @Override
    public void actualizar(String pedido) {
        System.out.println("Barista: preparando " + pedido);
    }
}
