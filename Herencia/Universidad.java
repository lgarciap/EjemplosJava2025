import java.util.ArrayList;

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


    public Double calcularNomina(){
            
    }
}
