// Interfaz Sujeto: define cómo registrar, eliminar y notificar observadores
public interface Sujeto {
    void registrarObservador(Observador o);
    void eliminarObservador(Observador o);
    void notificarObservadores(String pedido);
}
