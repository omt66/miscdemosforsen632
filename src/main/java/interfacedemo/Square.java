/*
 *  NU Educational License - 2017
 */
package interfacedemo;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Square implements IArea {
    double side;
    
    Square(double side) {
        this.side = side;
    }

    @Override
    public double findArea() {
        double area = side*side;
        
        return area;
    }
    
}
