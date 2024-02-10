package builder;


public class PokemonBuilder {
    //Este modelo busca crear objetos con diferentes  metodos evitando sobre carga de contructor
    
    private int vida;
    private String tipo;
    private String nombre;
   
    
    public PokemonBuilder(){
    }
    
    public PokemonBuilder(String tipo, int vida,  String nombre){
    
        this.tipo=tipo;
        this.nombre= nombre;
        this.vida=vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "PokemonBuilder{" + "vida=" + vida + ", tipo=" + tipo + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
