/*
 *  NU Educational License - 2017
 */
package abstractclasssdemo;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Faculty extends Person {
    String facultyId;
    
    Faculty(String name, int age, String facultyId) {
        super(name, age);
        this.facultyId = facultyId;
    }

    @Override
    void introcudeYourself() {
        System.out.println("Hi there. I am " + name + " and I am " 
                            + age + " years old."
                            + " I am a faculty at NU, my id is "
                            + facultyId);
    }
}
