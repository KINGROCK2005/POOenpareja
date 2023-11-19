import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

   

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
    //Metodos getters
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    public Revolver getRevolver() {
        return revolver;
    }

    //Metodos setters
    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }


    public Juego(int numJugadores) {
        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6;
        }

        jugadores = new ArrayList<>();
        revolver = new Revolver();

        for (int i = 1; i <= numJugadores; i++) {
            jugadores.add(new Jugador(i));
        }
    }

    public boolean finJuego() {
        for (Jugador jugador : jugadores) {
            if (!jugador.isVivo()) {
                return true;
            }
        }
        return false;
    }

    public void ronda() {
        for (Jugador jugador : jugadores) {
            jugador.disparar(revolver);
            revolver.siguienteBala();
            revolver.mostrar();
            if (finJuego()) {
                break;
            }
        }
    }
}
