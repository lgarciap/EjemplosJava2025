import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiltroCensurador implements Filtrado {
    private final String nombre = "FiltroCensurador";
    private final int prioridad = 25;
    private String textoOriginal;
    private final List<String> palabrasProhibidas;

    public FiltroCensurador() {
        palabrasProhibidas = new ArrayList<>(Arrays.asList(
                "tonto", "feo", "malo", "bobo", "idiota"
        ));
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
        if (texto == null || texto.isEmpty()) return false;
        for (String palabra : palabrasProhibidas) {
            if (texto.toLowerCase().contains(palabra.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String aplicarFiltro(String texto) {
        textoOriginal = texto;
        String censurado = texto;

        for (String palabra : palabrasProhibidas) {
            String regex = "(?i)\\b" + palabra + "\\b"; // ignora mayúsculas/minúsculas
            censurado = censurado.replaceAll(regex, "***");
        }

        return censurado;
    }

    @Override
    public String textoOriginal(String texto) {
        return textoOriginal;
    }

    @Override
    public String getExplicacion() {
        return "Censura palabras inapropiadas reemplazándolas por '***'.";
    }
}