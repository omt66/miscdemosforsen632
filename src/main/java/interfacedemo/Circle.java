/*
 *  NU Educational License - 2017
 */
package interfacedemo;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Circle implements IArea {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double findArea() {
        double area = 3.1415926*radius*radius;
        
        return area;
    }
    
}
