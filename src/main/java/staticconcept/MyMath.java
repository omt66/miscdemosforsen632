/*
 *  NU Educational License - 2017
 */
package staticconcept;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class MyMath {
    public static final double PI = 3.1415926;
    public static final double E = 2.718;
    
    public static double square(double n) {
        return n*n;
    }
    
    public static double min(double x, double y) {
        if (x < y)
            return x;
        
        return y;
    }
}
