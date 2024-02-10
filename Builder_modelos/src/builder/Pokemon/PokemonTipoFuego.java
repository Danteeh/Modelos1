package builder.Pokemon;

public class PokemonTipoFuego extends AbstractPokemon {

    @Override
    public void buildTipo() {
        pokemon.setTipo("Fuego");
    }

    @Override
    public void buildNombre() {
        pokemon.setNombre("Charmander");
    }

    @Override
    public void buildVida() {
        pokemon.setVida(100);
    }
    




}
