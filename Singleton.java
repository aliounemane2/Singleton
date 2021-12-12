
// Le pattern singleton est constitué d’une seule classe : 
// 1)  Convention qui garantit qu’un seul objet est instancié pour une classe donnée Fournit 
// 2) une méthode de classe unique retournant cette instance

public class Singleton{
    
    private static Singleton uniqueInstance;
    
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
