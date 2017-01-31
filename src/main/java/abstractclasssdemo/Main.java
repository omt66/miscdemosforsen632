/*
 *  NU Educational License - 2017
 */
package abstractclasssdemo;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Abstract Class Demo ---");
        
        Person person1 = new Faculty("Jane", 25, "123");
        Person person2 = new Staff("Mary", 22, "Id100");
        
        person1.introcudeYourself();
        person2.introcudeYourself();
    }
}
