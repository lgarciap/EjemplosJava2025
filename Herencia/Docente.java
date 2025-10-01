
public class Docente extends Trabajador {
    private int aniosAntiguedad;
    private String gradoCientifico;
    
    public Docente(){
        super();
        aniosAntiguedad = 0;
        gradoCientifico = "";
    }

    public Docente(String nombre, String nit, String direccion, 
    double salarioBase, int horasAusencia, int aniosAntiguedad, 
    String gradoCientifico){
        super(nombre, nit, direccion, salarioBase, horasAusencia);
        this.aniosAntiguedad = aniosAntiguedad;
        this.gradoCientifico = gradoCientifico;
    }

    public int getAniosAntiguedad(){
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAnt){
        this.aniosAntiguedad = aniosAnt;
    }

    public String getGradoCientifico(){
        return gradoCientifico;
    }

    public void setGradoCientifico(String gc){
        this.gradoCientifico = gc;
    }

    /**
     * Calcula el plus por antiguedad del docente
     * @return (double) con el plus por antiguedad
     */
    public double plusAntiguedad(){
        double plus = 0.0;
        plus = Math.floor((double)aniosAntiguedad/5)*20;
        return plus;
    }

    /**
     * Calcula el plus por grado cientifico del docente
     * @return (int) con el plus por grado cientifico
     */
    public int plusGradoCientifico(){
        int plus = 0;
        if (gradoCientifico.equals("Master")){
            plus = 80;
        }
        if (gradoCientifico.equals("Doctor")){
            plus = 120;
        }
        return plus;
    }

    /**
     * Calcula el salario total del docente
     * @return (double) con el salario total
     */
    public double calcularSalario(){
        double salario = super.calcularSalario(); //es el salario calculado en comun de la clase trabajador
        salario = salario + plusAntiguedad() + plusGradoCientifico();
        return salario;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nAnios de Antiguedad: " + aniosAntiguedad +
        "\nGrado Cientifico: " + gradoCientifico;

    }
}
