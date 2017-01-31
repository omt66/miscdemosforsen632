/*
 *  NU Educational License - 2017
 */
package chapter9.inheritance;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Engine {
    String type;
    String brand;
    
    Engine(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }
    
    public String getInfo() {
        String info = "";
        
        info += "type: " + type + " engine brand: " + brand;
        
        return info;
    }
}
