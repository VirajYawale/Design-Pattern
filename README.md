# Design-Pattern



1. how a design pattern is described? 
2. describe the template for design pattern.

(write all the 13 points)

3. what are the elements of pattern
(name, pattern, solution, consequences) - write those 4 points

4. describe the classification of design pattern depending on purpose and scope - 5M

### **Singleton Design pattern**
Singleton Design Pattern 
Type: Creational design pattern
Idea: Ensure that a class has only one instance in the whole application, and provide a global point of access to it.

✨ Key Points:
- Only one object is ever created.
- Provides a static method (usually getInstance()) to access that object.
- Commonly used for logging, configuration, database connections, thread pools.

Refer(handwrittern notes): 1.Singleton_pattern > Main > Singleton_pattern.java
        2. Singleton_pattern > Main > Singleton_pattern1.java
        3. Singleton_pattern > earlymain.java & earlysingleton.java


### **Prototype Design pattern**
Prototype Design Pattern 
Type: Creational design pattern
Idea: Instead of creating new objects from scratch (using new), create them by cloning an existing object (prototype).

✨ Key Points:
- Used when object creation is expensive, time-consuming, or complex.
- Provides a clone() method to duplicate objects.
- Ensures new objects can be made quickly with the same initial state.

Advantages:
- Reduces the cost of creating objects.
- Avoids subclassing for object creation.
- Easy to add/remove prototypes at runtime.

Refer: 1.prototype_pattern 
        2. prototype_ex (extra example solved)



try for extension for singleton pattern (Task)

Application of Singleton


Question: 
1. the object should be create with lazy or egaer

2. what do you mean by 

3. how to over come the problem of thread unsaftey in singleton pattern



Que. Following is the given class diargm for the employee and the student records. Use prototype pattern to implement prototipical instances student prototype and teacher prototype. Make use of these prototype in your program to create new objects.

name,  student_id , employee_id, salary , cgpa


proxy pattern is important with many variations



## composite pattern 
leaf and composite



## Decorator or Warper Design pattern  -- important topic

dynamicaly, builder(to build the component) adds component and decorate adds functionality

in case of composite patern object can contain mulitiple components but in case of decorate, decrator decotrats the singlr component