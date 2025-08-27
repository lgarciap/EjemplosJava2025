public class Materia{
    private String nombre;
    private float nota;
    private int ciclo;
	public Materia() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nombre
	 * @param nota
	 * @param ciclo
	 */
	public Materia(String nombre, float nota, int ciclo) {
		this.nombre = nombre;
		this.nota = nota;
		this.ciclo = ciclo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public int getCiclo() {
		return ciclo;
	}
	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", nota=" + nota + ", ciclo=" + ciclo + "]";
	}
	

}