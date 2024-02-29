package bridge;


public class PortalDimensional extends Portal {
    public PortalDimensional(PortalImplementor impl) {
        super(impl);
    }

    @Override
    void activar() {
        implementor.activarPortal();
    }

    @Override
    void utilizar() {
        implementor.usarPortal();
    }
}
