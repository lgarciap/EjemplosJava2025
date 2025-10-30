public class FiltroSinVocales implements Filtrado {

    @Override
    public String getNombre() {
        return "FiltroSinVocales";
    }

    @Override
    public int getPrioridad() {
        return 30;
    }

    @Override
    public boolean soporta(String texto) {
        if (texto == null) return false;
        return texto.matches(".*[aeiouáéíóúAEIOUÁÉÍÓÚ].*");
    }

    @Override
    public String textoOriginal(String texto) {
        return texto;
    }

    @Override
    public String aplicarFiltro(String texto) {
        if (!soporta(texto)) return texto;
        return texto.replaceAll("[aeiouáéíóúAEIOUÁÉÍÓÚ]", "");
    }

    @Override
    public String getExplicacion() {
        return "El FiltroSinVocales elimina todas las vocales del texto, " +
               "incluyendo las vocales acentuadas y mayúsculas.";
    }
}
