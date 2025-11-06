public class Principal{
    public static void main(String[] args) {
        FiltroHashtag_mio filtro = new FiltroHashtag_mio();
        FiltroHashtag_mio otrofiltro = new FiltroHashtag_mio();
        otrofiltro.setPrioridad(40);
        Filtrado filtrar = new FiltroCensurador();

        System.out.println(filtro.aplicarFiltro("La planilla de la Asociación de llama Sinergia y los invita como equipo a tomar un cafe mientras firman el contrato"));
        System.out.println(filtrar.aplicarFiltro("El árbol tonto, no pudo regar su semilla"));

        System.out.println(filtro.compareTo(otrofiltro));

    }   
}