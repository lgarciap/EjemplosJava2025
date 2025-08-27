import java.util.ArrayList;

public class Anio {
    private int cantMaterias;
    // private Materia[] materias;
    private ArrayList<Materia> materias;    


    // Constructores
    public Anio(){
        this.cantMaterias = 0;
        this.materias = new ArrayList<Materia>();

    }

    public Anio(int cant){
        this.cantMaterias = 0;
        this.materias = new ArrayList<Materia>(cant);

    }

    //Agregarv materia con if
    public void agregarMateria(String nombre, float nota, int numeroMateria,int ciclo){
        Materia mat = new Materia(nombre, nota);
        materias.add(mat);
    }

    public float calcularPromedioCiclo1(){
        float prom = 0;
        return prom;
    }

    public float calcularPromedioCiclo2(){
        float prom = 0;
        return prom;
    }

    public float calcularPromedioAnio(){
        float prom = 0;
        return prom;
    }

    public String toString(){
        String cadena = "Resumen del Semestre:\n";
        return cadena;
    }
        
}
