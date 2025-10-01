import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Trabajador> listaEmpleados;

    public Universidad(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaEmpleados = new ArrayList<Trabajador>();
    }

    public Universidad() {
        this.nombre = "";
        this.direccion = "";
        this.telefono = "";
        this.listaEmpleados = new ArrayList<Trabajador>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public ArrayList<Trabajador> getListaEmpleados() {
        return listaEmpleados;
    }
    public void setListaEmpleados(ArrayList<Trabajador> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    /**
     * Agrega un empleado a la lista de empleados de la universidad.
     * @param nombre
     * @param nit
     * @param direccion
     * @param salarioBase
     * @param horasAusencia
     * @param aniosAntiguedad
     * @param gradocientifico
     * @param feriadosTrabajados
     * @param tipoTrabajador: 1 para Docente, 2 para NoDocente
     */
    public void agregarEmpleado(String nombre, String nit, 
    String direccion, double salarioBase, int horasAusencia, 
    int aniosAntiguedad, String gradocientifico,int feriadosTrabajados,
    int tipoTrabajador){

        Trabajador nuevoEmpleado = null;
        if (tipoTrabajador == 1){
            nuevoEmpleado = new Docente(nombre, nit, direccion, salarioBase, horasAusencia, aniosAntiguedad, gradocientifico);
        }
        if (tipoTrabajador == 2){
            nuevoEmpleado = new NoDocente(nombre, nit, direccion, salarioBase, horasAusencia, feriadosTrabajados);
        }
        if (nuevoEmpleado != null){
            listaEmpleados.add(nuevoEmpleado);
        }

    }

    /**
     * Calcula la nomina total de la universidad
     * @return double con la nomina total sin diferenciar tipo de trabajador
     */
    public Double calcularNomina(){
        double total = 0;
        for (Trabajador t: listaEmpleados)
            total = total + t.calcularSalario();
        return total;
    }

    /**
     * Calcula la nomina total de la universidad, recorriendo la lista de empleados por posición
     * @return double con la nomina total sin diferenciar tipo de trabajador
     */
    public double calcularNom(){
        double total = 0.0;
        for (int i = 0; i < listaEmpleados.size(); i++){
            total += listaEmpleados.get(i).calcularSalario();
        }
        return total;
    }

    public double salarioTotalDocentes(){
        double total = 0;
        for (Trabajador t: listaEmpleados){
            if (t instanceof Docente){
                total = total + t.calcularSalario();
            }
        }
        return total;
    }
    public double salarioTotalNoDocentes(){
        double total = 0;
        for (Trabajador t: listaEmpleados){
            if (t instanceof NoDocente){
                total = total + t.calcularSalario();
            }
        }
        return total;
    }

    /**
     * Devolver los nombres de todos los docentes que tienen Maestría
     */
    public String docentesMaestria(){
        String nombres ="";
        String gradoCient  = "";
        for (Trabajador t: listaEmpleados){
            if (t instanceof Docente){
                gradoCient = ((Docente)t).getGradoCientifico();
                if (gradoCient.equals("Master"))
                    nombres = nombres + "- " + t.getNombre() + "\n";
            }
        }
        return nombres;

    }
}
