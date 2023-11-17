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
        int edad = scan.nextInt();
        alumno.getEdad();
        
        do {
            System.out.println("Ingrese la calificacion: ");
            }while (!scan.hasNextInt() && calificacion <= 10);
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scan.next(); 

            int calificacion = scan.nextInt();
            alumno.getCalificacion();


        System.out.println(calificacion);
        
    }
}
