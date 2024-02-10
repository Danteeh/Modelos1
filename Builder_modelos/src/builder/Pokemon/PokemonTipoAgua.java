package builder.Pokemon;

public class PokemonTipoAgua  extends AbstractPokemon {

    @Override
    public void buildTipo() {
       pokemon.setTipo("Agua");
    }

    @Override
    public void buildNombre() {
        pokemon.setNombre("Squirtle");
    }

    @Override
    public void buildVida() {
        pokemon.setVida(90);
    }
    




}
