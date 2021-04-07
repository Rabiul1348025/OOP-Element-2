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
 * Animal abstract class contains the basic features 
 * for which all animals posses according to the fictional universe
 * a name, age and description.
 */
public abstract class Animal{
    
    private String name;
    private int age;
    private String description = "";
    
    public Animal(String name, int age) {
        System.out.printf("Creating %s\n", name);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
