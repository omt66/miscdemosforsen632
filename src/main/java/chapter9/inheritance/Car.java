/*
 *  NU Educational License - 2017
 */
package chapter9.inheritance;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Car {
    Engine engine;
    String brand;
    String color;
    int nofDoors;
    
    Car(Engine engine, String brand, String color, int nofDoors) {
        this.engine = engine;
        this.brand = brand;
        this.color = color;
        this.nofDoors = nofDoors;
    }
    
    public String getInfo() {
        String info = "";
        
        info += "Engine: " + engine.getInfo() 
                + " car brand: " + brand 
                + " color: " + color
                + " number of doors " + nofDoors;
        
        return info;
    }
}
