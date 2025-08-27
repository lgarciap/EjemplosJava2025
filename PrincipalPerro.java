import java.util.Scanner;
public class PrincipalPerro {
    public static void main(String[] args){
        System.out.println("Hola, Bienvenidos al programa de los Perros");
        Perro miPerro;
        miPerro = new Perro(); //uso el constructor de la clase Perro  
        System.out.println(miPerro.getRaza());
        miPerro.setRaza("Pastor Aleman");
        miPerro.setColor("Manto Negro");
        miPerro.setEdad(3);
        miPerro.setGenero("Hembra");
        miPerro.setNombre("Lisa");
        miPerro.setTamanio("Grande");
        miPerro.setTemperamento("Inquieta");
        System.out.println(miPerro.getRaza());
        System.out.println("Mi perro se llama " + miPerro.getNombre() + 
                           ", es de raza " + miPerro.getRaza() + 
                           ", tiene " + miPerro.getEdad() + " años, " +
                           "es de color " + miPerro.getColor() + 
                           ", su genero es " + miPerro.getGenero() +
                           ", su tamaño es " + miPerro.getTamanio() +
                           ", y su temperamento es " + miPerro.getTemperamento());
        Perro miOtroPErro = new Perro("labrador",10,"negro","calmado","hembra","Laika","mediano",50);
        System.out.println("Mi otro perro es: "+miOtroPErro);

        miPerro = miOtroPErro;

        System.out.println(miPerro);

        miOtroPErro.setEdad(11);

        System.out.println(miPerro.getEdad());

        Scanner teclado = new Scanner(System.in);
        System.out.println("Quiere ingresar otro perro (\"si/no\")");
        String rpta = teclado.nextLine();

        if (rpta.equals("si"))
            System.out.println("Perfecto");
        else
            System.out.println("No entré al if");

    }

    

}