package bridge;


public class Teletransportador implements PortalImplementor {
    @Override
    public void activarPortal() {
        System.out.println("Teletransportador activado");
    }

    @Override
    public void usarPortal() {
        System.out.println("Utilizando el teletransportador");
    }
}
