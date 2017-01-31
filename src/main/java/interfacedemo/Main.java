/*
 *  NU Educational License - 2017
 */
package interfacedemo;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Interface Demo ---");

//        SampleClass sc = new SampleClass();
//        sc.doSomething1();
//        sc.doSomething2();
        
        IArea square = new Square(12);
        IArea circle = new Circle(10);
        double area = square.findArea();
        System.out.println("Area of the square is " + area);
        
        area = circle.findArea();
        System.out.println("Area of the circle is " + area);
    }
}

class SampleClass implements Interface1, Interface2 {

    @Override
    public void doSomething1() {
        System.out.println("In the doSomething1()");
    }

    @Override
    public void doSomething2() {
        System.out.println("In the doSomething2()");
    }

}

