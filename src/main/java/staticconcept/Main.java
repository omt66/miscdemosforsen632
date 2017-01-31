/*
 *  NU Educational License - 2017
 */
package staticconcept;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        println("--- Static Methods Demo ---");
        
        double result = MyMath.square(3);
        println("Square of 3 is " + result);
        
        result = MyMath.min(10, 123);
        println("Min value between 10 and 123 is " + result);
        
        println("Mathematical Pi is " + MyMath.PI);
        
    }

    private static void println(String msg) {
        System.out.println(msg);
    }
}
