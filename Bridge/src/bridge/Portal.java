package bridge;

public abstract class Portal {
    protected PortalImplementor implementor; //aqui se genera el bridge

    public Portal(PortalImplementor impl) {
        this.implementor = impl;
    }

    abstract void activar();
    abstract void utilizar();
}
