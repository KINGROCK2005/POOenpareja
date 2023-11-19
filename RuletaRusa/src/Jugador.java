public class Jugador {

    private int iD;
    private String nombre;
    private boolean Vivo;
    
    public Jugador(int iD) {
        this.iD = iD;
        this.nombre = "Jugador " + iD;
        this.Vivo = true;
    }
    
    public Jugador(int posiActual, int posiBala, int iD, String nombre, boolean vivo) {
        this.iD = iD;
        this.nombre = nombre;
        this.Vivo = vivo;
    }

    //Metodos getters
    public int getiD() {
        return iD;
    }
    public String getNombre() {
        return nombre;
    }
    public boolean isVivo() {
        return Vivo;
    }

    //Metodos setters
    public void setiD(int iD) {
        this.iD = iD;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setVivo(boolean vivo) {
        Vivo = vivo;
    }
    
    
    public void disparar(Revolver revolver) {
        System.out.println(this.nombre + " se apunta y dispara.");
        if (revolver.disparar()) {
            this.Vivo = false;
            System.out.println("¡" + this.nombre + " ha muerto!");
        } else {
            System.out.println(this.nombre + " sigue vivo.");
        }
    }
    
}
