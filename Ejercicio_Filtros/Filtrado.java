public interface Filtrado{
    /**
     * Obtiene el nombre del filtro
    */
    public String getNombre(); 
    /**
     * Obtiene la prioridad del filtro
     * @return int con la prioridad
     */
    public int getPrioridad();
    /**
     * Verifica si el filtro soporta la cadena de texto o no
     * @param texto: String
     * @return true si soporta o false si no soporta
     */
    public boolean soporta(String texto);

    /**
     * Reinicia el filtro devolviendo el texto original
     * @param texto: String
     * @return El texto original: String
     */
    public String textoOriginal(String texto);

    /**
     * Aplica el filtro a la cadena de texto
     * @param texto:String
     * @return El texto con el filtro aplicado
     */
    public String aplicarFiltro(String texto);

    /**
     * Devuelve la explicación de lo que hace el filtro
     * @return String
     */
    public String getExplicacion();
}