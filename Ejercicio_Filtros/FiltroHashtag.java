public class FiltroHashtag implements Filtrado{
    String [] listaPalabras;

    @Override
    public String getNombre() {
        return "FiltroHashtag";
    }

    @Override
    public int getPrioridad() {
        return 45;
    }

    @Override
    public boolean soporta(String texto) {
        //aquí se verifica si cumple con el proceso
        listaPalabras = texto.split(" ");
        for (String palabra: listaPalabras){
            if (palabra.length()>5){
                return true;
            }
        }
        return false;
    }

    @Override
    public String textoOriginal(String texto) {
        return texto;
    }

    @Override
    public String aplicarFiltro(String texto) {
        String textoConFiltro="";
        //Aquí se realiza el proceso del texto
        if (soporta(texto)){
            for (String palabra: listaPalabras){
                if (palabra.length()>5){
                    palabra=palabra.replace(",", "");
                    textoConFiltro+="#" + palabra + "\n ";
                }
            }
        }
        return textoConFiltro;
    }

    @Override
    public String getExplicacion() {
        return "Convierte palabras clave mayores a 5 letras en un #";
    }
    
}
