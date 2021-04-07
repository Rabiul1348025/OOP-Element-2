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
 * Solution to 1 b.
 * 
 * Pigs are animals but eat trash etc, and they can also oink
 */
public class Pigs extends Animal implements Living {

    public Pigs(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Eat junk");
    }

    @Override
    public void move() {
        System.out.println("Move on four legs");
    }
    
    public void oink() {
        System.out.printf("Pig %s oinks!!\n", getName());
    }
    
}
