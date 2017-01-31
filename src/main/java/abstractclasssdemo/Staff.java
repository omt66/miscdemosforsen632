/*
 *  NU Educational License - 2017
 */
package abstractclasssdemo;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Staff extends Person {
    String staffId;
    
    Staff(String name, int age, String id) {
        super(name, age);
        staffId = id;
    }

    @Override
    void introcudeYourself() {
        System.out.println("Hi there. I am " + name + " and I am " 
                            + age + " years old."
                            + " I am a staff at NU, my id is "
                            + staffId);
    }
}
