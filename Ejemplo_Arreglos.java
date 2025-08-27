public class Ejemplo_Arreglos{
    public static void main(String[] args){
        int[] numeros = new int[5];
        int unnumero = 0;
        System.out.println(numeros);
        Perro[] mis_perros = new Perro[3];
        mis_perros[0] = new Perro();
        for(int i = 0;i<mis_perros.length;i++)
            System.out.println(mis_perros[i]);
        System.out.println("Con while");
        int i = 0;
        while (i<3){
            System.out.println(mis_perros[i]);
              
        } i++; 

    }
}