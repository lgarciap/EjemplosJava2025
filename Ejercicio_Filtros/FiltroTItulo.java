public class FiltroTItulo implements Filtrado {
    private String textoOriginal;
    private final int prioridad = 25;
    private final String nombre = "Filtro Título";
    
    public FiltroTItulo() {
        this.textoOriginal = "";
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
        // Verifica si hay palabras separadas por espacio y contiene letras
        return texto != null && texto.contains(" ") && texto.matches(".*[a-zA-Z].*");
    }
    
    @Override
    public String textoOriginal(String texto) {
        return this.textoOriginal;
    }
    
    @Override
    public String aplicarFiltro(String texto) {
        this.textoOriginal = texto;
        
        // Dividir el texto en palabras por espacios
        String[] palabras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > 0) {
                // Capitalizar primera letra y convertir el resto a minúsculas
                String palabraCapitalizada = palabras[i].substring(0, 1).toUpperCase() 
                                           + palabras[i].substring(1).toLowerCase();
                resultado.append(palabraCapitalizada);
            }
            
            // Agregar espacio entre palabras (excepto después de la última)
            if (i < palabras.length - 1) {
                resultado.append(" ");
            }
        }
        
        return resultado.toString();
    }
    
    @Override
    public String getExplicacion() {
        return "Este filtro capitaliza la primera letra de cada palabra separada por espacios," +
               " convirtiendo el resto de las letras a minúsculas (En formato título).";
    }
}