/*
 *  NU Educational License - 2017
 */
package abstractclasssdemo;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public abstract class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
//    void introcudeYourself() {
//        System.out.println("Hello I am " + name);
//    }
    abstract void introcudeYourself();
    
}
