import java.util.Random;
import java.util.Scanner;

// Clase que representa a un personaje dentro del juego
class Personaje {
    private String nombre;
    private int puntosDeVida;
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;
    private String arma;

    // Constructor que inicializa el nombre y el arma del personaje
    public Personaje(String nombre, String arma) {
        this.nombre = nombre;
        this.puntosDeVida = 100; // Todos los personajes inician con 100 puntos de vida
        this.arma = arma;
    }

    // Método que permite atacar a otro personaje
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int daño = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO; // Daño aleatorio entre 10 y 30

        // Modificador de daño según el arma elegida
        if (arma.equalsIgnoreCase("espada")) {
            daño = Math.min(daño + 2, MAX_DANO); // La espada aumenta ligeramente el daño sin pasar el máximo
        } else if (arma.equalsIgnoreCase("arco")) {
            daño = Math.max(daño - 2, MIN_DANO); // El arco reduce un poco el daño pero nunca baja del mínimo
        }

        // Se aplica el daño al oponente
        oponente.recibirDaño(daño);
        System.out.println(this.nombre + " ataca con su " + arma + " a " + oponente.getNombre()
                + " causando " + daño + " puntos de daño.");
    }

    // Método que permite recibir daño y reducir los puntos de vida
    public void recibirDaño(int daño) {
        this.puntosDeVida -= daño;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0; // Los puntos de vida no pueden ser negativos
        }
    }

    // Método que verifica si el personaje sigue con vida
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    // Métodos get para acceder a los atributos privados
    public String getNombre() {
        return this.nombre;
    }

    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public String getArma() {
        return this.arma;
    }
}

// Clase que controla el desarrollo del juego y la pelea entre los personajes
class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;

    // Constructor que crea los dos personajes del juego
    public JuegoLucha(String nombre1, String arma1, String nombre2, String arma2) {
        this.jugador1 = new Personaje(nombre1, arma1);
        this.jugador2 = new Personaje(nombre2, arma2);
    }

    // Método que inicia la pelea entre los dos personajes
    public void iniciarPelea() {
        System.out.println("La pelea comienza entre " + jugador1.getNombre() + " (arma: " + jugador1.getArma() + ") y "
                + jugador2.getNombre() + " (arma: " + jugador2.getArma() + ")...");
        System.out.println("---------------------------------------------------------");

        // Ciclo que se ejecuta mientras los dos personajes estén vivos
        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2); // Turno del jugador 1
            if (jugador2.estaVivo()) { // Solo si el jugador 2 sigue vivo, ataca
                turno(jugador2, jugador1);
            }
        }

        // Resultado final de la pelea
        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado la pelea.");
        }
    }

    // Método que representa el turno de ataque de un personaje contra otro
    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("Turno de " + atacante.getNombre() + ". Puntos de vida de " + defensor.getNombre() + ": "
                + defensor.getPuntosDeVida());
        atacante.atacar(defensor); // El atacante realiza el ataque
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
        System.out.println("---------------------------------------------------------");
    }

    // Método principal que ejecuta el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita los nombres y armas de los dos jugadores
        System.out.print("Introduce el nombre del jugador 1: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Elige un arma para " + nombre1 + " (Espada/Arco): ");
        String arma1 = scanner.nextLine();

        System.out.print("Introduce el nombre del jugador 2: ");
        String nombre2 = scanner.nextLine();

        System.out.print("Elige un arma para " + nombre2 + " (Espada/Arco): ");
        String arma2 = scanner.nextLine();

        // Crea una nueva partida y la inicia
        JuegoLucha juego = new JuegoLucha(nombre1, arma1, nombre2, arma2);
        juego.iniciarPelea();
    }
}
