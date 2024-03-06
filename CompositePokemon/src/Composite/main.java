/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;

/**
 *
 * @author Boing
 */
public class main {
    
    
    public static void main(String[] args) {
        Pokemon charizard = new Pokemon("Charizard");
        Pokemon pikachu = new Pokemon("Pikachu");

        EquipoPokemon equipo = new EquipoPokemon();
        equipo.agregarMiembro(charizard);
        equipo.agregarMiembro(pikachu);

        equipo.mostrarInfo();
    }
    
}
