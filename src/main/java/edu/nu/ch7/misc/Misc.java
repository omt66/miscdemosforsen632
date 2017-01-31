/*
 *  NU Educational License - 2017
 */
package edu.nu.ch7.misc;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Misc {
    public static void main(String[] args) {
        int items[] = { 0, 2, 4, 6, 8 };
        
        for(int i = 0; i < items.length; i++ )
           System.out.printf( "%d\n", items[i] );
        
        
        for( int i : items )
         System.out.printf( "%d\n", i );
        
        A a = new A();
        a.doSomething();
    }
}

interface I1 {
    void doSomething1();
}

interface I2 {
    void doSomething2();
}

abstract class AbstractA {
    void doSomething() {
        System.out.println("This will do something.");
        doSomethingSpecific();
    }
    
    abstract void doSomethingSpecific();
}

class A extends AbstractA implements I1, I2 {

    @Override
    public void doSomething1() {
        System.out.println("doSomething1 from I1");
    }

    @Override
    public void doSomething2() {
        System.out.println("doSomething2 from I2");
    }

    @Override
    void doSomethingSpecific() {
        doSomething1();
        doSomething2();
    }
    
}