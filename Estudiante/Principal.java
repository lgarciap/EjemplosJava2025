import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese los datos de la Primera Materia:");
        System.out.print("Nombre: ");
        String nombreMat1 = teclado.nextLine(); 
        System.out.print("Nota: ");
        float notaMat1 = teclado.nextFloat();
        teclado.nextLine(); // Leer el enter pendiente
        System.out.println("Ingrese los datos de la Segunda Materia:");
        System.out.print("Nombre: ");
        String nombreMat2 = teclado.nextLine();
        System.out.print("Nota: ");
        float notaMat2 = teclado.nextFloat();
        teclado.nextLine(); // Leer el enter pendiente
        System.out.println("Ingrese los datos de la Tercera Materia:");
        System.out.print("Nombre: ");
        String nombreMat3 = teclado.nextLine();
        System.out.print("Nota: ");
        float notaMat3 = teclado.nextFloat();
        teclado.nextLine(); // Leer el enter pendiente  
        
        //Inicializar el objeto semestre con los datos por defecto y luego llenar las materias
        /* 
        Semestre ciclo1 = new Semestre();
        ciclo1.agregarMateria(nombreMat1, notaMat1, 1);
        ciclo1.agregarMateria(nombreMat2, notaMat2, 2);
        ciclo1.agregarMateria(nombreMat3, notaMat3, 3);
        */

        //Inicializar el objeto semestre con los datos del constructor con parámetros
        Semestre ciclo1 = new Semestre(nombreMat1, notaMat1,nombreMat2, notaMat2, nombreMat3, notaMat3);
        System.out.println("Su promedio es: "+ciclo1.calcularPromedio());
        System.out.println(ciclo1);
    }
}
