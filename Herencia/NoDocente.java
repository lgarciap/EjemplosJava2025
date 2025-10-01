public class NoDocente extends Trabajador{
    private int feriadosTrabajados;

    public NoDocente(){
        super();
        feriadosTrabajados = 0;
    }

    public NoDocente(String nombre, String nit, String direccion, 
    double salarioBase, int horasAusencia, int feriadosTrabajados){
        super(nombre, nit, direccion, salarioBase, horasAusencia);
        this.feriadosTrabajados = feriadosTrabajados;
    }   

    public void setFeriadosTrabajados(int feriadosTrabajados) {
        this.feriadosTrabajados = feriadosTrabajados;
    }
    
    public int getFeriadosTrabajados() {
        return feriadosTrabajados;
    }

    /**
     * Calcula el pago extra por feriados trabajados
     * @return (double) con el pago extra por feriados trabajados
     */
    public double extrasFeriados(){
        double tarifaDiaria = salarioBase / 24;
        double feriadosTrab = tarifaDiaria * 2 * feriadosTrabajados;
        return feriadosTrab;
    }


    /*
     * Calcula el salario total del no docente
     * @return (double) con el salario total del no docente
     */
    public double calcularSalario(){
        double salario_Base = super.calcularSalario();
        salario_Base = salario_Base + extrasFeriados();
        return salario_Base;
    }
    @Override
    public String toString() {
        return super.toString() + "\nFeriados Trabajados: " + feriadosTrabajados;
    }
}
