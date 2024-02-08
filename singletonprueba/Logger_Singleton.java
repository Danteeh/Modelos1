package singletonprueba;

public class Logger_Singleton {

    private static Logger_Singleton singleton;
    private String value;

    public Logger_Singleton() {

    }

    public static Logger_Singleton getInstance() {

        if (singleton == null) {

            singleton = new Logger_Singleton();

        }

        return singleton;
    }
    
    
   public void log(String msg){
       System.out.println(msg);
   
   }
   
   public void setValue(String msg){
   value= msg;
   }
   
   
   public String getValue(){
    return value;
   }

}
