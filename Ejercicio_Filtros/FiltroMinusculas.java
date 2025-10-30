public class FiltroMinusculas implements Filtrado {
    private final String nombre = "FiltroMinusculas";
    private final int prioridad = 20;
    private String original;

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
        return texto != null && texto.matches(".*[A-ZÁÉÍÓÚ].*");
    }

    @Override
    public String textoOriginal(String texto) {
        return original;
    }

    @Override
    public String aplicarFiltro(String texto) {
        original = texto;
        return texto.toLowerCase();
    }

    @Override
    public String getExplicacion() {
        return "Convierte todas las letras del texto a minúsculas.";
    }
}
