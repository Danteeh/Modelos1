package singletonprueba;

class SingletonPrueba {


    public static void main(String[] args) {
       
        
        Logger_Singleton singleton = Logger_Singleton.getInstance();
        singleton.log("Hola mundo");
        Logger_Singleton  singleton2 = Logger_Singleton.getInstance();
        
        singleton.setValue("Soy singleton sin importar quien");
        System.out.println(singleton2.getValue());
        
        
        
        
    }
    
}
