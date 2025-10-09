import java.util.Random;
import java.util.Scanner;

class Personaje {
    private String nombre;
    private int puntosDeVida;
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;
    private String arma;
    // Constructor para inicializar los datos del personaje
    public Personaje(String nombre, String arma) {
        this.nombre = nombre;
        this.puntosDeVida = 100; // Todos comienzan con 100 puntos de vida
        this.arma = arma;
    }

    // Método para realizar un ataque a otro personaje
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int daño = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO; // Daño entre 10 y 30

        // Modificador de daño según el arma
        if (arma.equalsIgnoreCase("espada")) {
            daño += 5; // La espada da un poco más de daño
        } else if (arma.equalsIgnoreCase("arco")) {
            daño -= 3; // El arco hace un poco menos
            if (daño < 1) daño = 1;
        }

        oponente.recibirDano(daño);
        System.out.println(this.nombre + " ataca con su " + arma + " a " + oponente.getNombre()
                + " causando " + daño + " puntos de daño.");
    }

    // Método para recibir daño
    public void recibirDano(int daño) {
        this.puntosDeVida -= daño;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0; // No se puede tener menos de 0 puntos de vida
        }
    }

    // Verifica si el personaje sigue vivo
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    // Devuelve el nombre del personaje
    public String getNombre() {
        return this.nombre;
    }

    // Devuelve los puntos de vida actuales
    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }

    // Devuelve el arma del personaje
    public String getArma() {
        return this.arma;
    }
}

class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;

    // Constructor para inicializar los personajes
    public JuegoLucha(String nombre1, String arma1, String nombre2, String arma2) {
        this.jugador1 = new Personaje(nombre1, arma1);
        this.jugador2 = new Personaje(nombre2, arma2);
    }

    // Método para iniciar la pelea
    public void iniciarPelea() {
        System.out.println("La pelea comienza entre " + jugador1.getNombre() + " (arma: " + jugador1.getArma() + ") y "
                + jugador2.getNombre() + " (arma: " + jugador2.getArma() + ")...");
        System.out.println("---------------------------------------------------------");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        // Mostrar el resultado de la pelea
        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado la pelea.");
        }
    }

    // Método que representa un turno de ataque
    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("Turno de " + atacante.getNombre() + ". Puntos de vida de " + defensor.getNombre() + ": "
                + defensor.getPuntosDeVida());
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
        System.out.println("---------------------------------------------------------");
    }

    // Método principal que ejecuta el juego
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del jugador 1: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Elige un arma para " + nombre1 + " (Espada/Arco): ");
        String arma1 = scanner.nextLine();

        System.out.print("Introduce el nombre del jugador 2: ");
        String nombre2 = scanner.nextLine();

        System.out.print("Elige un arma para " + nombre2 + " (Espada/Arco): ");
        String arma2 = scanner.nextLine();

        JuegoLucha juego = new JuegoLucha(nombre1, arma1, nombre2, arma2);
        juego.iniciarPelea();

    }
}