public class Anio {
    private int cantMaterias;
    private Materia[] materias;


    // Constructores
    public Anio(){
        this.cantMaterias = 0;
        this.materias = new Materia[14];

    }

    public Anio(int cant){
        this.cantMaterias = 0;
        this.materias = new Materia[cant];

    }

    //Agregarv materia con if
    public void agregarMateria(String nombre, float nota, int numeroMateria){
        Materia mat = new Materia(nombre, nota);
        materias[numeroMateria] = mat;
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
