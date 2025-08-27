import java.lang.Math;
import java.util.Scanner;

public class EjemploDatosExp{
    public static void main(String[] args){
        final int edad = 3; // Constante, no se puede cambiar su valor
        // edad = 4; // Esto causaría un error de compilación porque 'edad
        System.out.println("La edad es "+edad+" años");
        String edadPersona = "18";
        int unoMas = 1;
        String resultadoSuma = edadPersona + unoMas; // Concatenación de cadenas
        System.out.println("La edad es " + resultadoSuma + " \naños");
        int num1 = 2,num3=3;
        double resultadoExponente = Math.pow(num1,2);
        System.out.println(resultadoExponente);
        float numFloat = 3.14f; // Sufijo 'f' para indicar que es un float
        double numDouble = 0;
        numDouble = numFloat;
        numFloat = (float)numDouble;
        System.out.println("El valor de numDouble es: " + numDouble);
        float divisionEntera = num1/(float)num3; // División entera
        System.out.println("El resultado de la división entera es: " + divisionEntera);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.nextLine(); 
        System.out.println("Ingrese su edad: ");
        int edadP = teclado.nextInt();
        teclado.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Ingrese el nombre de su perro: ");
        String nombrePerro = teclado.nextLine();

        System.out.println("Hola " + nombre + ", tienes " + edadP + " años y tu perro se llama " + nombrePerro + ".");

    }
}