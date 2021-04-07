/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtm.models;

import dtm.interfaces.Living;

/**
 *
 * @author rabiul
 * 
 * Solution to Task 1 b.
 * 
 * Birds are Animals but the move by flying. and eat worms.
 * Birds extend Animals and implement Living interface.
 */
public class Bird extends Animal implements Living {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Eat worms");
    }

    @Override
    public void move() {
        fly();
    }
    
    private void fly() {
        System.out.printf("Bird %s flies\n", getName());
    } 
    
}
