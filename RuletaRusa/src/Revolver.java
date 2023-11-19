public class Revolver {

    private int posiActual;
    private int posiBala;
    
    public Revolver(int posiActual, int posiBala) {
        this.posiActual = posiActual;
        this.posiBala = posiBala;
    }

    //Metodos getters
    public int getPosiActual() {
        return posiActual;
    }
    public int getPosiBala() {
        return posiBala;
    }

    //Metodos setter
    public void setPosiActual(int posiActual) {
        this.posiActual = posiActual;
    }
    public void setPosiBala(int posiBala) {
        this.posiBala = posiBala;
    }

    public Revolver() {
        this.posiActual = 1;
        this.posiBala = (int) (Math.random() * 6) + 1;
    }

    public boolean disparar() {
        return this.posiActual == this.posiBala;
    }

    public void siguienteBala() {
        this.posiActual = (this.posiActual % 6) + 1;
    }

    public void mostrar() {
        System.out.println("Posición actual del tambor: " + this.posiActual);
        System.out.println("Posición de la bala en el tambor: " + this.posiBala);
    }

}
