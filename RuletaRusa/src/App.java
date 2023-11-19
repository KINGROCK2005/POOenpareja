import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el número de jugadores (entre 1 y 6): ");
        int numJugadores = scan.nextInt();

        Juego juego = new Juego(numJugadores);

        while (!juego.finJuego()) {
            juego.ronda();
        }

        System.out.println("El juego ha terminado.");
        scan.close();
        
    }
}