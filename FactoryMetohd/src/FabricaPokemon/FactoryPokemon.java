package FabricaPokemon;

public class FactoryPokemon {
    
    
   
    public Pokemon crearPokemon(String tipo) {
        switch (tipo.toLowerCase()) {
            case "fuego":
                return new PokemonFuego();
            case "agua":
                return new PokemonAgua();
            case "hierba":
                return new PokemonHierba();
            default:
                throw new IllegalArgumentException("Tipo de Pokémon no válido");
        }
    }
}


    

