public class Materia{
    private String nombre;
    private float nota;
    //Constructores
    public Materia(){
        this.nombre = "";
        this.nota = 0.0f;
    }
    public Materia(String nombre, float nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    //Getters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public float getNota(){
        return nota;
    }
    public void setNota(float nota){
        this.nota = nota;
    }
    //toString
    public String toString(){
        String cadena = "";
        cadena = "Materia: "+nombre+"\n"+"Nota: "+nota;
        return cadena;
    }
}