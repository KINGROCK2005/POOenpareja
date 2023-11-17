import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        estudiante alumno = new estudiante();
        System.out.println("Ingrese los datos del estudiante: ");
        System.out.print("Ingrese el sexo: ");
        String sexo = scan.nextLine();
        alumno.getSexo();
        System.out.print("Ingrese el nombre: ");
        String Nombre = scan.nextLine();
        alumno.getNombre();
        System.out.println("Ingrese la edad: ");
        while (!scan.hasNextInt()) {
            System.out.println("Intente denuevo ");
            scan.next();
        }
        int edad = scan.nextInt();
        alumno.getEdad();
        do {
            System.out.print("Ingrese la calificación: ");
            while (!scan.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
               scan.next();
            }
            int calificacion = scan.nextInt();
            alumno.getCalificacion();;

        } while (calificacion < 0 || calificacion >= 10);

        profesor maestro = new maestro();
        System.out.println("Ingrese los datos del profesor: ");
        System.out.print("Ingrese el sexo: ");
        String sexo = scan.nextLine();
        maestro.getSexo();
        System.out.print("Ingrese el nombre: ");
        String Nombre = scan.nextLine();
        maestro.getNombre();
        System.out.println("Ingrese la edad: ");
        while (!scan.hasNextInt()) {
            System.out.println("Intente denuevo ");
            scan.next();
            int edad = scan.nextInt();
            alumno.getEdad();
        }
    }
}
