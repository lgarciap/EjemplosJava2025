/**
 * Clase que representa a un trabajador con sus atributos y métodos.
 * Incluye métodos para calcular la tarifa horaria basada en el salario base.
 * 
 * @version 1.0
 * @author POO 20
 * @date 24/09/2025
 */
public class Trabajador {
    private String nombre;
    private String nit;
    private String direccion;
    protected double salarioBase;
    private int horasAusencia;    

    public Trabajador(){
        nombre = "";
        nit = "";
        direccion = "";
        salarioBase = 0.0;
        horasAusencia = 0;
    }
    public Trabajador(String nombre, String nit, String direccion, double salarioBase, int horasAusencia){
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.salarioBase = salarioBase;
        this.horasAusencia = horasAusencia;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getNit(){
        return nit;
    }

    public void setNIT(String nit){
        this.nit = nit;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public void setSalarioBase(double salarioB){
        this.salarioBase = salarioB;
    }

    public int getHorasAusencia(){
        return horasAusencia;
    }

    public void setHoraAusencia(int horasA){
        this.horasAusencia = horasA;
    }

    /**
     * Calcula la tarifa horaria del trabajador
     * @return (double) con la tarifa horaria
    */
    public double tarifaHoraria(){
        double tarifa = salarioBase / 192;
        return tarifa;
    }

    /**
     * Calcula el descuento por ausencias del trabajador
     * @return (double) con el descuento por ausencias
    */
    public double descuentoXausencias(){
        double desc = tarifaHoraria()*horasAusencia;
        return desc;
    }

    /**
     * Calcula el salario del trabajador
     * @return (double) con el salario del trabajador
    */
    public double calcularSalario(){
        double salario = salarioBase - descuentoXausencias();
        return salario;
    }

    public String toString(){
        String info = "Nombre: " + nombre + "\nNIT: " + nit + "\nDireccion: " + direccion +
        "\nSalario Base: " + salarioBase + "\nHoras de Ausencia: " + horasAusencia;
        return info;
    }

}