package Composite;

import java.util.ArrayList;
import java.util.List;


public class EquipoPokemon implements PokemonComponent {
    private List<PokemonComponent> miembros = new ArrayList<>();

    public void agregarMiembro(PokemonComponent miembro) {
        miembros.add(miembro);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Equipo Pokémon:");
        for (PokemonComponent miembro : miembros) {
            miembro.mostrarInfo();
        }
    }
}
