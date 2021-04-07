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
 * Solution to Task 1 a.
 * 
 * Model for children, and extends to the Person abstract class
 * Implement living interface which has functions that all living
 * things exhibit, such as eating and moving
 */
public class Child extends Person implements Living {
    
    public Child(int age, String gender, String name, String profession) {
        super(age, gender, name, profession);
    }

    @Override
    public void eat() {
        System.out.println("Eats candy, etc");
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
}
