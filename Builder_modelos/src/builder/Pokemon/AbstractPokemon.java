package builder.Pokemon;

import builder.PokemonBuilder;

public abstract class AbstractPokemon {

    protected PokemonBuilder pokemon;

    public PokemonBuilder getPokemon() {

        return pokemon;
    }

    public void crearPokemon() {

        pokemon = new PokemonBuilder();

    }
    
    public abstract void buildTipo();
    public abstract void buildNombre();
    public abstract void buildVida();
}
