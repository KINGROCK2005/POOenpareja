public class profesor extends estudiante{

    private String nombre;
    private int edad;
    private String sexo;
    private String claseImpart;

    public profesor(String nombre, int edad, String sexo, int calificacion, String claseImpart) {
        super(nombre, edad, sexo, calificacion);
        nombre = nombre;
        edad = edad;
        sexo = sexo;
        this.claseImpart = claseImpart;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getSexo() {
        return sexo;
    }
    public int getclaseImpart() {
        return claseImpart;
    }

    //Metodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setclaseImpart(int claseImpart) {
        this.claseImpart = claseImpart;
    }  
    

    public profesor(){
        
    }
}
