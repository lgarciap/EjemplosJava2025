import java.util.Scanner;
public class Principal2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Anio anio = new Anio();
        String nombreMat = "";
        float notaMat = 0.0f;
        int cantMat = 3;
        
            for (int i = 0; i<cantMat; i++){
            	try{
	                System.out.println("Ingrese los datos de la Materia "+(i+1)+": ");
	                System.out.print("Nombre: ");
	                nombreMat = teclado.nextLine();
	                System.out.print("Nota: ");
	                notaMat = teclado.nextFloat();
	                teclado.nextLine(); // Leer el enter pendiente
                    anio = null;
	                anio.agregarMateria(nombreMat, notaMat, i);
	                
                }
                catch (NullPointerException e){
                    System.out.println("El objeto no fue creado");
                    System.out.println(e.getMessage());
                } 
                catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("mi hermano ingresa un número");
               }
               finally{
                    teclado.nextLine();
                    i--; 
               }

	        }
	            
        //System.out.println("Su promedio es: "+anio.calcularPromedio());
    }
}
