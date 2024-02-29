
package bridge;


public class Agujerodegusano implements PortalImplementor{
    
     @Override
    public void activarPortal() {
        System.out.println("Agujero de gusano abierto");
    }

    @Override
    public void usarPortal() {
        System.out.println("Viajando a través del agujero de gusano");
    }
    
}
