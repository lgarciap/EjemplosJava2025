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
    public void agregarMateria(String nombre, float nota, int ciclo){
        Materia mat = new Materia(nombre, nota,ciclo);
        materias.add(mat);
    }

    public float calcularPromedioCiclo1(){
        float suma=0,prom = 0;
        int cant = 0;
        for (Materia materia : materias) {
			if (materia.getCiclo() == 1) {
				suma = suma + materia.getNota();
				cant++;
			}
		}
        prom = suma/cant;
        return prom;
    }

    public float calcularPromedioCiclo2(){
        float suma=0,prom = 0;
        int cant = 0;
        for (Materia materia : materias) {
			if (materia.getCiclo() == 2) {
				suma = suma + materia.getNota();
				cant++;
			}
		}
        prom = suma/cant;
        return prom;
    }

    public float calcularPromedioAnio() throws Exception {
        float sum = 0;
        for (Materia mat : materias)
        	sum = sum+mat.getNota();
        return sum/materias.size();
    }

    public String toString(){
        String cadena = "Resumen del Semestre:\n";
        return cadena;
    }
        
}
