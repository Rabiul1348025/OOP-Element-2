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
 * Model for adults, and extends the Person 
 * Implement living interface which has functions that all living
 * things exhibit, such as eating and moving
 */
public class Adult extends Person implements Living {    
    
    public Adult(int age, String gender, String name, String profession) {
        super(age, gender, name, profession);
    }

    @Override
    public void eat() {
        System.out.println("Eat adult food");
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
