package factorymetohd;

import FabricaPokemon.FactoryPokemon;
import FabricaPokemon.Pokemon;

public class Main {
    public static void main(String[] args) {

     
        FactoryPokemon factory = new FactoryPokemon();

        Pokemon fuegoPokemon = factory.crearPokemon("fuego");
        fuegoPokemon.atacar();
        fuegoPokemon.defender();

        Pokemon aguaPokemon = factory.crearPokemon("agua");
        aguaPokemon.atacar();
        aguaPokemon.defender();

        Pokemon hierbaPokemon = factory.crearPokemon("hierba");
        hierbaPokemon.atacar();
        hierbaPokemon.defender();
    }
}
