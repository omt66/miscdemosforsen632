/*
 *  NU Educational License - 2017
 */
package chapter9.inheritance;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Animal {
    protected String kind; 
    protected String name;
    
    public String getKind() {
        return kind;
    }
    
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}
