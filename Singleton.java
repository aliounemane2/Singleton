
public class Singleton{
    
    private static Singleton uniqueInstance;
    
    // Rendre privé le constructeur de la classe : Impossible d’instancier la classe
    private Singleton(){}
    
    // fournit un moyen d'instancier et d'en trouver une seule instance
    public static Singleton getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new Singleton();
        
        return uniqueInstance; 
    }
    
    public static void main(String []args){
        Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
    }
}
