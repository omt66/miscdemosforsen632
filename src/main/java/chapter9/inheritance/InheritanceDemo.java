/*
 *  NU Educational License - 2017
 */
package chapter9.inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("--- Inheritance Demo ---");
        
        List<Animal> animals = new ArrayList<Animal>();
        
        Animal dog1 = new Dog("Pixie");
        animals.add(dog1);
        
//        String kind = dog1.getKind();
//        System.out.println("Kind of the animal is " + kind);
        
        Animal cat1 = new Cat("Niyoki");
        Animal cat2 = new Cat("Cutie");        
        animals.add(cat1);
        animals.add(cat2);
        
//        kind = cat1.getKind();
//        System.out.println("Kind of the animal is " + kind);
//     
//        dog1.makeSound();
//        cat1.makeSound();
//        
        
        for (Animal animal: animals) {
            animal.makeSound();
        }

    }
}
