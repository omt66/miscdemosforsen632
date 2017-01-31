/*
 *  NU Educational License - 2017
 */
package chapter9.inheritance;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class CarDemo {
    public static void main(String[] args) {
        System.out.println("--- Car Demo ---");
        
        Engine engine = new Engine("Diesel", "Toyota");
        Car car = new Car(engine, "Toyota", "Blue", 4);
        
        System.out.println("My car info: " + car.getInfo());
    }
}
