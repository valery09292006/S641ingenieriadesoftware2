import java.util.ArrayList;
import java.util.List;

// Clase concreta que implementa el Sujeto
public class Cafeteria implements Sujeto {
    private List<Observador> observadores = new ArrayList<>();

    @Override
    public void registrarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void eliminarObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores(String pedido) {
        for (Observador o : observadores) {
            o.actualizar(pedido);
        }
    }

    // Método que simula la llegada de un pedido
    public void nuevoPedido(String pedido) {
        System.out.println("\n📦 Nuevo pedido recibido: " + pedido);
        notificarObservadores(pedido);
    }
}

