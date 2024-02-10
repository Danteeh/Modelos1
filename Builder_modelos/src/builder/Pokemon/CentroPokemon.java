package builder.Pokemon;

import builder.PokemonBuilder;


public class CentroPokemon {
    
    
    private AbstractPokemon BuilderPokemon;
    
    public void setBuilder(AbstractPokemon BuilderPokemon){
     this.BuilderPokemon = BuilderPokemon;
    }
    
    public PokemonBuilder getBuilder(){
        return BuilderPokemon.getPokemon();
    
    }
    
    public void ConstruirPokemon(){
      BuilderPokemon.crearPokemon();
      BuilderPokemon.buildNombre();
      BuilderPokemon.buildVida();
      BuilderPokemon.buildTipo();
    }
    
}
