public class FiltroAlternadorMayusMinus implements Filtrado {
    private String nombre;
    private int prioridad;

    public FiltroAlternadorMayusMinus() {
        this.nombre = "Filtro Alternador Mayus Minus";
        this.prioridad = 95;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getPrioridad() {
        return this.prioridad;
    }

    @Override
    public boolean soporta(String texto) {
        return texto != null && !texto.isEmpty();
    }

    @Override
    public String textoOriginal(String texto) {
        return texto;
    }

    @Override
    public String aplicarFiltro(String texto) {
        String resultado = "";
        boolean mayuscula = true;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (mayuscula) {
                    if (c >= 'a' && c <= 'z') {
                        resultado = resultado + (char)(c - 32);
                    } else {
                        resultado = resultado + c;
                    }
                } else {
                    if (c >= 'A' && c <= 'Z') {
                        resultado = resultado + (char)(c + 32);
                    } else {
                        resultado = resultado + c;
                    }
                }
                mayuscula = !mayuscula;
            } else {
                resultado = resultado + c;
            }
        }

        return resultado;
    }

    @Override
    public String getExplicacion() {
        return "Este filtro alterna entre mayúsculas y minúsculas en las letras del texto.";
    }
}