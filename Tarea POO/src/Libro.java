public class Libro {

    private int ISBN;
    private String Titulo;
    private String Autor;
    private int numPaginas;

    public Libro(){
        this(0, "No disponible", "Nop disponible", 0);
    }
    
    public Libro(int SBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numPaginas = numPaginas;
    }

    //Metodos getters
    public int getISBN() {
        return ISBN;
    }
    public String getTitulo() {
        return Titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    
    //Metodos setters
    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public void setAutor(String autor) {
        Autor = autor;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void mostrar(){
        System.out.println("El libro " + Titulo + " con ISBN " + ISBN + " creado por el escritos " + Autor + " tiene " + numPaginas + " paginas.");
    }

    public void establecerduracion(int duracion){//Set duracion
        if(duracion < 0){
            this.numPaginas = 0;
        }else {
            this.numPaginas = duracion;
        }
    }
    
}
