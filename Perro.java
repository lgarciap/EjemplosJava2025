public class Perro{
    // Atributos
    private String raza;
    private int edad;
    private String color;
    private String temperamento;
    private String genero;
    private String nombre;
    private String tamanio;
    private float peso;
    // Constructor
    public Perro(){
      raza = "sato";
      edad = 0;
      color = "cafe";
      temperamento = "jugueton";
      genero = "macho";
      nombre = "firulais";   
      tamanio = "mediano";
      peso = 10;
    }

    public Perro(String raza, int edad, String color,String temperamento,String genero, String nombre, String tamanio,float peso){
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.temperamento = temperamento;
        this.genero = genero;
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.peso = peso;
    }
    // Getters y Setters
    public String getRaza(){
        return raza;
    }

    public void setRaza(String nuevaRaza){
        raza = nuevaRaza;
    }

    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }


    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTemperamento() {
        return this.temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String toString(){
        String cadena = "";
        cadena = "Nombre del perro:"+nombre+"\n color: "+color+"\n tamaño: "+tamanio+"\n edad: "+edad+
        "\n temperamento: "+temperamento+"\n peso: "+peso+"\n raza: "+raza+"\n genero: "+genero;
        return cadena;
    }



}