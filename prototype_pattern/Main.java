package prototype_pattern;


public class Main {
    public static void main(String[] args) {
        PhonePrototype p1 = new PhonePrototype("mac", 8, 6);
        LaptopPrototype l1 = new LaptopPrototype("i9", 64);

        PhonePrototype p2 = (PhonePrototype) p1.clone();
        LaptopPrototype l2 = (LaptopPrototype) l1.clone();

        System.out.println("Original : ");
        System.out.println(p1);
        System.out.println(l1);
        
        System.out.println("Cloned : ");
        System.out.println(p2);
        System.out.println(l2);
        
    }

}

// compiler and run from the parent directory - because of package 

// javac prototype_pattern/*.java
// java prototype_pattern.Main 
