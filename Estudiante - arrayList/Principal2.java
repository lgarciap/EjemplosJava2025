import java.util.Scanner;
public class Principal2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Anio anio = new Anio();
        String nombreMat = "";
        float notaMat = 0.0f;
        int cantMat = 3;
        for (int i = 0; i<cantMat; i++){
            System.out.println("Ingrese los datos de la Materia "+(i+1)+": ");
            System.out.print("Nombre: ");
            nombreMat = teclado.nextLine();
            System.out.print("Nota: ");
            notaMat = teclado.nextFloat();
            teclado.nextLine(); // Leer el enter pendiente
            anio.agregarMateria(nombreMat, notaMat, i);

        }
        //System.out.println("Su promedio es: "+anio.calcularPromedio());
    }
}
