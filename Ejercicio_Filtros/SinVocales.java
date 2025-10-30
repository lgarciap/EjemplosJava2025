import java.text.Normalizer;

public class SinVocales implements Filtrado{

    public String getNombre() {
        return "Filtro: Sin Vocales";
    }

    public int getPrioridad() {
        return 30;
    }

    public boolean soporta(String texto) {
       return texto.toLowerCase().matches(".*[aeiou]*.");
        }

    public String textoOriginal(String texto){
        return texto;
    }

    public String aplicarFiltro(String texto){
        if(soporta(texto)){
        return Normalizer.normalize(texto, Normalizer.Form.NFD) // separa letras y tildes
                .replaceAll("\\p{M}", "")      // elimina tildes
                .replaceAll("(?i)[aeiou]", "");}

        else {return "No se pudo realizar la acción";}
    }

    public String getExplicacion() {
        return "Este filtro elimina las vocales que se presentan en la cadena de texto";
    }
}
