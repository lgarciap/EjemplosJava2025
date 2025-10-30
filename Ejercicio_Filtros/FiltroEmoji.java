

public class FiltroEmoji implements Filtrado{
    private String nombre;
    private int prioridad;

    public FiltroEmoji() {
        this.nombre = "Filtro de Emojis";
        this.prioridad = 60;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public boolean soporta(String texto) {
        if (texto == null) {
            return false;
        }
        return texto.equals("cafe") || texto.equals("equipo") || texto.equals("contrato");
    }

    public String aplicarFiltro(String texto) {
        return texto.replace("cafe", "☕️")
                    .replace("equipo", "🤝")
                    .replace("contrato", "📜");
    }

    public String textoOriginal(String texto) {
        return texto.replace("☕️", "cafe")
                    .replace("🤝", "equipo")
                    .replace("📜", "contrato");
    }

    public String getExplicacion() {
        return "Este filtro reemplaza palabras comunes con sus emojis correspondientes para hacer el texto más visual y atractivo.";
    }

    public int compareTo(Object o) {
        if (this.prioridad < ((Filtrado)o).getPrioridad()) {
            return -1;
        } else if (this.prioridad > ((Filtrado)o).getPrioridad()) {
            return 1;
        } else {
            return 0;
        }
    }

}