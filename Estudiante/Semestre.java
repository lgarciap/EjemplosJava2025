public class Semestre {
    private int cantMaterias;
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;

    // Constructores
    public Semestre(){
        this.cantMaterias = 0;
        this.materia1 = new Materia();
        this.materia2 = new Materia();
        this.materia3 = new Materia();
    }

    public Semestre(String nombreMat1, float notaMateria1, String nombreMat2, 
                    float notaMat2, String nombreMat3, float notaMat3) {    
                        materia1 = new Materia(nombreMat1, notaMateria1);
                        materia2 = new Materia(nombreMat2, notaMat2);   
                        materia3 = new Materia(nombreMat3, notaMat3);
                        this.cantMaterias = 3;
                }
    //Agregarv materia con if
    public void agregarMateria(String nombre, float nota, int numeroMateria){
        if (numeroMateria == 1){
            materia1.setNombre(nombre);
            materia1.setNota(nota);
            this.cantMaterias++;
        }
        else if (numeroMateria == 2){
            materia2.setNombre(nombre);
            materia2.setNota(nota);
            this.cantMaterias++;
        }
        else if (numeroMateria == 3){
            materia3.setNombre(nombre);
            materia3.setNota(nota);
            this.cantMaterias++;
        }
    }

    public float calcularPromedio(){
        float suma = 0;
        suma = materia1.getNota()+materia2.getNota()+materia3.getNota();
        return suma/cantMaterias;
    }

    public String toString(){
        String cadena = "Resumen del Semestre:\n";
        cadena = cadena + materia1.toString() + "\n" 
                        + materia2.toString() + "\n" 
                        + materia3.toString();
        return cadena;
    }
}
