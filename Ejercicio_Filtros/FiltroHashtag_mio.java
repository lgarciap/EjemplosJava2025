public class FiltroHashtag_mio implements Filtrado, Comparable{
    private String texto;
    private String nombre;
    private int prioridad;

    public FiltroHashtag_mio(){
        texto = "";
        nombre = "Filtro Hashtag";
        prioridad = 45;
    }
    @Override
    public String getNombre() {
        return this.nombre;
    }

    public void setPrioridad(int la_prioridad){
        this.prioridad = la_prioridad;
    }
    @Override
    public int getPrioridad() {
        return prioridad;
    }
    @Override
    public boolean soporta(String texto) {
        String[] lista = texto.split(" ");
        int cant_pal_largas = 0;
        for (String palabra:lista){
            if (palabra.length()>5){
                cant_pal_largas++;
            }
        }
        if (cant_pal_largas>0)
            return true;
        else
            return false;
    }
    @Override
    public String textoOriginal(String texto) {
        return texto;
    }
    @Override
    public String aplicarFiltro(String texto) {
        String texto_filtrado = texto;
        String[] lista = new String[100] ;
        if (soporta(texto)){
                lista = texto.split(" ");
            for (String palabra:lista){
                if (palabra.length()>5){
                    palabra = "#"+palabra.replace(" ", "");
                }
                texto_filtrado = texto_filtrado + " " +palabra;
            }
            return texto_filtrado;
            
        }
        else
            return "No soportado";

        
    }
    @Override
    public String getExplicacion() {
        return "Convierte palabras clave (>5 letras) a #PalabraClave.";
    }
    @Override
    public int compareTo(Object o) {
        if (this.prioridad<((FiltroHashtag_mio)o).getPrioridad())
            return -1;
        else 
            if (this.prioridad>((FiltroHashtag_mio)o).getPrioridad())
                return 1;
        return 0;
      
    }

    
}
