package singleton_pattern.Main;

// thread safe code

// if we don't want to use lock we will use eargly singleton pattern
// but it is not that practical because at the time of initialzation instance the object is created
// if further the object is not use then memory will get waste 

class Singleton1{
    private static Singleton1 instance;

    private Singleton1(){
        System.out.println("Constructor is called");
    } 
    static public Singleton1 getInstance(){
        // if(instance == null){
        //     instance = new Singleton1();
        // }
        // return instance;

        // while multithreading 2 threads can enter this code and create 2 object which violate the singleton fundamentals
        // for that we have to lock this (critical section code) so that only one thread should access it.

        // ---------------------------------------------

        // first we will check whether instance is null, if it is not the direct return the instance
        // if(instance == null){
        //     //lock
        //     synchronized (Singleton1.class){
        //         instance = new Singleton1();
        //     }
        // }
        // return instance;

        // ---------------------------------------------

        // the upper code will violate when there is first object made
        // in multithreading, 2 threads will check first if instance == null, it will access the loop then with the help of lock only one thread will create object 
        // but after the 1st thread create the object the 2nd only will also create the object 
        // for that we will use double locking it also check after enter the critical section.

        if(instance == null){
            synchronized (Singleton1.class){
                if(instance == null){
                    instance = new Singleton1();
                }
            }
        }
        return instance;



    }
}

public class Singleton_pattern1 {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        if(s1==s2){
            System.out.println("same");
        }
    }
}
