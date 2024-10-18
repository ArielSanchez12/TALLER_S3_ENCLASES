import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 3 ; i++) {
            System.out.println("Ingrese el avatar/nombre del jugador " + i + ":");
            String nombreJugador = scanner.nextLine();
            System.out.println("Ingrese la edad del jugador "+ i + ":");
            int edadJugador = scanner.nextInt();
            scanner.nextLine(); //Limpia el buffer del scanner para la siguiente entrada
            System.out.println("Ingrese el pais del jugador " + i + ":");
            String paisJugador = scanner.nextLine();
            int numJugador = i;
            scanner.nextLine();

            Jugador jugador = new Jugador(nombreJugador, edadJugador, paisJugador, numJugador); //Se crea un objeto jugador generico (sin numero)
            System.out.println("Acciones realizadas por el jugador: " + numJugador);
            jugador.patear();
            jugador.correr();

            if (i == 2) {
                jugador.saltar(2);
            }
        }
    }
}