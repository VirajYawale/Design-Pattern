package singleton_pattern.Main;

class Singleton{

    // instance to store the object instance
    private static Singleton instance;

    // public Singleton(){  ---> using this public we can make object from main class by new keyword
    //     System.out.println("singleton constructor called!");
    // }

    // using this public we can make object from main class by new keyword
    // but we want that not more than one object should be created

    // so we will make it private 
    private Singleton(){
        System.out.println("singleton constructor called!");
    }
    // this private keyword make it do not create object -- but it cut off all them
    // we want only one object should be created if other is tried to make it should return same object

    // for that 
    static public Singleton getInstance(){  // with the help of static key word the method will belong to class (with the help of class name me can call the method)
        // return new Singleton(); // still using this it is not creating only one obj
        // it is able to create many object

        // for that we will creating the variable that will store pointer from the heap of the singleton type object instance
        // then if instance if null then we will create the object, if already created the this method will return the instance.
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}

public class Singleton_pattern {
    public static void main(String[] args) {
        // Singleton s1 = new Singleton();
        Singleton s1 = Singleton.getInstance();
        // Singleton s2 = new Singleton();
        Singleton s2 = Singleton.getInstance();

        // Singleton s3 = Singleton.getInstance();

        if(s1 == s2){
            System.out.println("Both are same!");
        }
        // System.out.println(s3);
    }
}
