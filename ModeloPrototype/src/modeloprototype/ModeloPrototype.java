package modeloprototype;

import Modelo.IcuentaImpl;


public class ModeloPrototype {

  
    public static void main(String[] args) {
       
        
         IcuentaImpl cuentaahorro = new IcuentaImpl();
         cuentaahorro.setMonto(100);
         IcuentaImpl cuentaClonada = (IcuentaImpl) cuentaahorro.clonar();
         
         
         if (cuentaClonada !=null  ){
             System.out.println(cuentaClonada);
         }
         System.out.println(cuentaClonada==cuentaahorro);
                 
    }
    
}
