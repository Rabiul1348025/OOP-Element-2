package dtm.models;

import dtm.interfaces.Bite;
import dtm.interfaces.Living;

/**
 *
 * @author rabiul
 * 
 * Solution to Task 1 b.
 * 
 * Dogs are animals but bite and move on four legs.
 * they have other features like barking too.
 * 
 * Dog implements a the Living interface because it is living
 * as well as the Bite interface because it bites. 
 * 
 * Solution to Task 1 c.
 * Dog implements Bite interface
 */
public class Dog extends Animal implements Living, Bite {
    
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Eats sausages, etc");
    }

    @Override
    public void move() {
        System.out.println("Run with four legs");
    }

    @Override
    public void bite() {
        System.out.printf("Dog %s bites!!\n", getName());
    }
    
    public void bark() {
        System.out.printf("Dog %s barks : Woof!!!\n", super.getName());
    }
}
