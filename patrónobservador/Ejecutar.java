public class Ejecutar {
  public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria();
       
        Observador barista = new Barista();
        Observador caja = new Caja();
        Observador panel = new PanelPedidos();

    
        cafeteria.registrarObservador(barista);
        cafeteria.registrarObservador(caja);
        cafeteria.registrarObservador(panel);

    
        cafeteria.nuevoPedido("Latte");
        cafeteria.nuevoPedido("Café Americano");
        cafeteria.nuevoPedido("Capuchino");
    }
}  

