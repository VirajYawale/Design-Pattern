// package singleton_pattern;

import singleton_pattern.earlysingleton;

public class earlymain {
    public static void main(String[] args) {
        earlysingleton s1 = earlysingleton.getInstance(); // this is creating the instance 
        earlysingleton s2 = earlysingleton.getInstance(); // if we try to create 2nd instance then the same instance will be crate 
        System.out.println("Same instance? " + (s1 == s2));  // prints "true"
        s1.doSomething();
    }
}


// try for extension for singleton pattern