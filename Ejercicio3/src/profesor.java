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

    public profesor(){
        
    }
}
