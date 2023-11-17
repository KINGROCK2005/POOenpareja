import java.text.DecimalFormat;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        
        Raices operacion = new Raices();

        System.out.println("Ingrese el valor a: ");
        while (!scan.hasNextInt()) {
            System.out.println("Intente denuevo ");
            scan.next();
        }
        double a = scan.nextDouble();
        operacion.setA(a);
        System.out.println("Ingrese el valor b: ");
        while (!scan.hasNextInt()) {
            System.out.println("Intente denuevo ");
            scan.next();
        }
        double b = scan.nextDouble();
        operacion.setB(b);
        System.out.println("Ingrese el valor c");
        while (!scan.hasNextInt()) {
            System.out.println("Intente denuevo ");
            scan.next();
        }
        double c = scan.nextDouble();
        operacion.setC(c);

        
        double raiz1 = - b +Math.sqrt(Math.pow(b, 2) - (4 * a * c))/ (2*a);
        double raiz2 = - b -Math.sqrt(Math.pow(b, 2) - (4 * a * c))/ (2*a);

        Raices tieneRaices = new Raices(true);
        double discriminante = Math.pow(b, 2) -(4*a*c);

        String raiz1format = String.format("%.2f",raiz1);
        String raiz2format = String.format("%.2f",raiz2);
        String discrimformat = String.format("%.2f",discriminante);
        
        if( raiz1 > -100  && raiz2 > -100 && discriminante  > 0){
            System.out.println("Tiene dos soluciones reales diferentes: ");
            System.out.println("El discriminante es: " + discrimformat);
            System.out.println("La primera raiz es: " +  raiz1format);
            System.out.println("La segunda raiz es: " +raiz2format);
        }else if(discriminante == 0){
            System.out.println("Solo tiene una solucion reales iguales: ");
            System.out.println("El discriminante es: " + discrimformat);
            System.out.println("La primera raiz es: " + raiz1format);
            System.out.println("La segunda raiz es: " +raiz2format);
        }else if(discriminante < 0){
            System.out.println("Tiene raices complejas.");
            System.out.println("La primera raiz es: " + raiz1format);
            System.out.println("La segunda raiz es: " +raiz2format);
        } 
        
    }
}
