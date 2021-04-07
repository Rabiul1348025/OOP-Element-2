/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtm.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rabiul
 * 
 * Solution to 1 a.
 * 
 * This abstract class contains the relevant features
 * required for any person, adult or child.
 * The Adult and Child class models extend to this class.
 */
public abstract class Person {
    private int age;
    private String gender;
    private String name;
    private String profession;
    
    private String description = "";
    
    /**
     * 
     * Solution to 1 b.
     * 
     * List of pets that stores all pets a Character has.
     */
    private final List<Pet> pets;

    public Person(int age, String gender, String name, String profession) {
        System.out.printf("Creating %s\n", name);
        this.pets = new ArrayList<>();
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void addPet(Pet pet) {
    }
    
    public void removePet(Pet pet) {
        pets.remove(pet);
    }
}
