/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author Boing
 */
public class CiudadelaRick {
    
    public static void main(String[] args) {
        PortalImplementor teletransportador = new Teletransportador();
        PortalImplementor agujeroGusano = new Agujerodegusano();

        Portal portal1 = new PortalDimensional(teletransportador);
        Portal portal2 = new PortalDimensional(agujeroGusano);

        portal1.activar();
        portal1.utilizar();

        portal2.activar();
        portal2.utilizar();
    }
    
}
