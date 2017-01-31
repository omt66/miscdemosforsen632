/*
 *  NU Educational License - 2017
 */
package chapter9.inheritance;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Cat extends Animal {
    public Cat() {
        this.kind = "A cat";
    }
    
    public Cat(String name) {
        this.kind = "A cat";
        this.name = name;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Miow... I am " + this.name);
    }
}
