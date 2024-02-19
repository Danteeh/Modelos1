package FabricaPokemon;


public class PokemonFuego implements Pokemon{

   @Override
    public void atacar() {
        System.out.println("¡Ataque de fuego!");
    }

    @Override
    public void defender() {
        System.out.println("¡Defensa de fuego!");
    }
    
}
