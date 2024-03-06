package Composite;

public class Pokemon implements PokemonComponent {

    private String nombre;

    public Pokemon(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Pokémon: " + nombre);
    }

}
