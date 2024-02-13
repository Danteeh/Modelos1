
package Modelo;

import java.util.logging.Level;
import java.util.logging.Logger;


public class IcuentaImpl implements Icuenta {

    private String tipo;
    private double monto;
    
    public  IcuentaImpl(){
    
       tipo= "Ahorro";
    }
    
    
    
    @Override
    public Icuenta clonar() {
        
        IcuentaImpl cuenta = null;
        
        try {
            cuenta = (IcuentaImpl)clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(IcuentaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return cuenta;
        
        
    }

    @Override
    public String toString() {
        return "IcuentaImpl{" + "tipo=" + tipo + ", monto=" + monto + '}';
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
    
}
