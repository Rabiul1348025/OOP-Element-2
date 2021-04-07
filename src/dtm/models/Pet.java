/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtm.models;

/**
 *
 * @author rabiul
 * 
 * Solution to Task 1 b.
 * 
 * Model stores the Pet animal and it's owner
 */
public class Pet {
    
    Animal pet;
    Person owner;

    public Pet(Animal pet, Person owner) {
        System.out.printf("Creating Pet %s\n", pet.getName());
        this.pet = pet;
        this.owner = owner;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    
    
}
