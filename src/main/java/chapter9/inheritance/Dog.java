/*
 *  NU Educational License - 2017
 */
package chapter9.inheritance;

/**
 * Dog is a Animal. Therefore, it establishes
 * an IS-A relationship.
 * @author Ogun otigli@gmail.com
 */
public class Dog extends Animal {
    public Dog() {
        this.kind = "A dog";
    }
    
    public Dog(String name) {        
        this();
        this.name = name;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Bark... I am " + this.name);
    }
}
