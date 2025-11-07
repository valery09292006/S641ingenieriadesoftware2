public class Ejecutar {
  public static void main(String[] args) {
        // Crear el sujeto
        Cafeteria cafeteria = new Cafeteria();

        // Crear observadores
        Observador barista = new Barista();
        Observador caja = new Caja();
        Observador panel = new PanelPedidos();

        // Registrar observadores
        cafeteria.registrarObservador(barista);
        cafeteria.registrarObservador(caja);
        cafeteria.registrarObservador(panel);

        // Simular pedidos
        cafeteria.nuevoPedido("Milo");
        cafeteria.nuevoPedido("Avena");
        cafeteria.nuevoPedido("Capuchino");
    }
}  

