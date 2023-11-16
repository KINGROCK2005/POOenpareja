import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        
    Libro stayNight = new Libro();
    Scanner scan= new Scanner(System.in);  
        
    stayNight.setAutor("Reo Hideki");
    stayNight.setISBN(189424123);
    stayNight.setNumPaginas(235);
    stayNight.setTitulo("Stay Night Vol.1");

    System.out.println("Primer Libro \t");
    System.out.println("Titulo: " + stayNight.getTitulo()+".");
    System.out.println("Autor: " + stayNight.getAutor()+".");
    System.out.println("Numero de paginas: " + stayNight.getNumPaginas()+".");
    System.out.println("ISBN: " + stayNight.getISBN()+".");

    Libro Tulibro = new Libro();

    System.out.println("Segundo libro ");
    System.out.println("Ingrese el nombre del libro: ");
    String Titulo = scan.nextLine();
    Tulibro.setTitulo(Titulo);
    System.out.println("Nombre del autor del libro: ");
    String Autor = scan.nextLine();
    Tulibro.setAutor(Autor);
    System.out.println("Ingrese el numero de paginas que contiene: ");
    while (!scan.hasNextInt()) {
        System.out.println("Intente denuevo ");
        scan.next();
    }
    int numPaginas = scan.nextInt();
    Tulibro.setNumPaginas(numPaginas);
    System.out.println("Ingrese el ISBN o codigo de barra del libro: ");
    while (!scan.hasNextInt()) {
        System.out.println("Intente denuevo ");
        scan.next();
    }
    int ISBN = scan.nextInt();
    Tulibro.setISBN(ISBN);

    System.out.println("Titulo: " +Tulibro.getTitulo()+ ".");
    System.out.println("Autor: " + Tulibro.getAutor()+".");
    System.out.println("Numero de paginas: " +Tulibro.getNumPaginas()+".");
    System.out.println("ISBN: " + Tulibro.getISBN()+".");

    if(stayNight.getNumPaginas() > Tulibro.getNumPaginas() ){
        System.out.println("El libro con más paginas es: " + stayNight.getTitulo() + " con " + stayNight.getNumPaginas()+" paginas.");
    }else if(stayNight.getNumPaginas() < Tulibro.getNumPaginas()){ 
        System.out.println("El libro con más paginas es: " + Tulibro.getTitulo() + " con " + Tulibro.getNumPaginas()+" paginas.");
    }if(stayNight.getNumPaginas() == Tulibro.getNumPaginas()){
        System.out.println("Los libros tienen la misma cantidad de palabras.");
    }
     
    }
    
}
