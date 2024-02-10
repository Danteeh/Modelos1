
package Pokemon;

import builder.Pokemon.CentroPokemon;
import builder.Pokemon.PokemonTipoAgua;
import builder.Pokemon.PokemonTipoFuego;


public class Main {
    
    public static void main(String[] args) {
        
        CentroPokemon centro =  new CentroPokemon();
        centro.setBuilder(new PokemonTipoAgua());
        centro.ConstruirPokemon();
        System.out.println(centro.getBuilder());
        
        
        
         CentroPokemon centro1 =  new CentroPokemon();
        centro.setBuilder(new PokemonTipoFuego());
        centro.ConstruirPokemon();
        System.out.println(centro.getBuilder());
    }
    
    
}
