public class FiltradoMayusculas implements Filtrado {
    
    @Override
    public String getNombre() {
        return "FiltroMayusculas";
    }
    
    @Override
    public int getPrioridad() {
        return 20;
    }
    
    @Override
    public boolean soporta(String texto) {
        return texto != null && !texto.isEmpty() && texto.matches(".*[a-zA-Z].*");
    }
    
    @Override
    public String textoOriginal(String texto) {
        return texto;
    }
    
    @Override
    public String aplicarFiltro(String texto) {
        if (texto == null) return null;
        return texto.toUpperCase();
    }
    
    @Override
    public String getExplicacion() {
        return "Convierte todo el texto a letras mayúsculas";
    }
}