/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtm.models;

import dtm.interfaces.Bite;
import java.util.Random;

/**
 *
 * @author rabiul
 * 
 * Solution to 1 c.
 * 
 * Robot has both name and serial numbers.
 * It also implements the Bite interface
 */
public class Robot implements Bite {

    private String name;
    private int serialNumber = new Random().nextInt() % 100000007;

    public Robot(String name) {
        System.out.printf("Creating Robot %s\n", name);
        this.name = name;
    }
    
    public Robot(String name, int serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    
    @Override
    public void bite() {
        System.out.printf("Robot %s bites!!\n", getName());
    }  
    
    public int shoot() {
        Random rand = new Random();
        int bullets = rand.nextInt(10) % 10;
        bullets = 0 == bullets ? 1 : bullets;
        System.out.println("Robot shot " + bullets + " bullets!!!!");
        return bullets;
    }
}
