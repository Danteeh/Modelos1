/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricaPokemon;

/**
 *
 * @author Boing
 */
public class PokemonHierba implements Pokemon{
       @Override
    public void atacar() {
        System.out.println("¡Ataque de hierba!");
    }

    @Override
    public void defender() {
        System.out.println("¡Defensa de hierba!");
    }
    
}
