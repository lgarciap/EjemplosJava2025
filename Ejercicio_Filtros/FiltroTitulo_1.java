import java.util.StringJoiner;

/**
 * Clase: FiltroTitulo
 * Prioridad: 25
 * Capitaliza la primera letra de cada palabra del texto.
 * Implementa la interfaz Filtrado.
 */
public class FiltroTitulo_1 implements Filtrado, Comparable<Filtrado> {

    private final String nombre = "FiltroTitulo";
    private final int prioridad = 25;

    public FiltroTitulo_1() {
       
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public boolean soporta(String texto) {
        if (texto == null) return false;
        return texto.trim().contains(" ");
    }
    @Override
    public String textoOriginal(String texto) {
        return texto;
    }

    @Override
    public String aplicarFiltro(String texto) {
        if (texto == null || texto.isEmpty()) return texto;


        String[] palabras = texto.toLowerCase().split("\\s+");
        StringJoiner joiner = new StringJoiner(" ");


        for (String palabra : palabras) {
            if (palabra.length() > 0) {
                String capitalizada = palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
                joiner.add(capitalizada);
            }
        }

        return joiner.toString();
    }

    @Override
    public String getExplicacion() {
        return "Capitaliza la primera letra de cada palabra del texto.";
    }

    @Override
    public int compareTo(Filtrado otro) {
        return Integer.compare(this.getPrioridad(), otro.getPrioridad());
    }
}