import java.util.Scanner;

// ===================================================
// CLASE MAIN
// Muestra menú de selección y ejecuta el juego
// ===================================================
public class MainJuego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del jugador 1: ");
        String nombre1 = sc.nextLine();

        System.out.print("Introduce el nombre del jugador 2: ");
        String nombre2 = sc.nextLine();

        System.out.println("\nSelecciona un arma:");
        System.out.println("1. Espada");
        System.out.println("2. Arco");
        System.out.println("3. Hacha");
        System.out.println("4. Lanza");

        System.out.print(nombre1 + ", elige tu arma (1-4): ");
        Arma arma1 = seleccionarArma(sc.nextInt());

        System.out.print(nombre2 + ", elige tu arma (1-4): ");
        Arma arma2 = seleccionarArma(sc.nextInt());

        Personaje jugador1 = new Personaje(nombre1, arma1);
        Personaje jugador2 = new Personaje(nombre2, arma2);

        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);
        juego.iniciarPelea();
    }

    // Método para elegir arma según número
    private static Arma seleccionarArma(int opcion) {
        switch (opcion) {
            case 1: return new Espada();
            case 2: return new Arco();
            case 3: return new Hacha();
            case 4: return new Lanza();
            default:
                System.out.println("Opción no válida. Se asigna Espada por defecto.");
                return new Espada();
        }
    }
}
