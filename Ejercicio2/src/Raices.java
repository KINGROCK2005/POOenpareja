public class Raices{

    private boolean ex;
    private double resultado;
    private double discriminante;
    private double raiz1;
    private double raiz2;
    private double a;
    private double b;
    private double c;
    
    public Raices(double a, double b, double c, double raiz1, double raiz2, double discriminante, boolean ex ) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.raiz1 = raiz1;
        this.raiz2 = raiz2;
        this.ex = ex;
    }

    public Raices(){
        this(0,0,0,0,0,0,true);
    }

    public Raices(boolean ex){

    }

    //Metodos getters
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminante() {
        return discriminante;
    }
    public double getRaiz1() {
        return raiz1;
    }
    public double getRaiz2() {
        return raiz2;
    }
    public boolean isEx() {
        return ex;
    }

    //Metodos setters
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
     public void setDiscriminante(double discriminante) {
        this.discriminante = discriminante;
    }
    public void setRaiz1(double raiz1) {
        this.raiz1 = raiz1;
    }
    public void setRaiz2(double raiz2) {
        this.raiz2 = raiz2;
    }
    public void setEx(boolean ex) {
        this.ex = ex;
    }

    public void obtenerRaiz(){
        if(this.discriminante == 0){
            ex = true;
            System.out.println("Solo tiene una unica solución.");
            
        }else if(this.discriminante > 0){
            ex = false;
            System.out.println("Tiene dos soluciones.");
        }

    }

}