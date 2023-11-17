public class estudiante {

    private String nombre;
    private int edad;
    private String sexo;
    private int calificacion;
    public estudiante(String nombre, int edad, String sexo, int calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.calificacion = calificacion;
    }

    //metodos getters
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getSexo() {
        return sexo;
    }
    public int getCalificacion() {
        return calificacion;
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
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }  
    
    public estudiante(){
        
    }
}
