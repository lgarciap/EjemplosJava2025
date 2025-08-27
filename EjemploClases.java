import java.util.Random;
import java.lang.Math;
public class EjemploClases {
    public static void main(String[] args){
        Random generador = new Random();
        int numAleatorio = generador.nextInt();
        System.out.println(numAleatorio);
        double raiz = Math.sqrt(numAleatorio);*
        System.out.println("La raiz cuadrada del número aleatorio es: "+raiz);
    }
}
