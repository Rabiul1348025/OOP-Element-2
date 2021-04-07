/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtm.game;

import dtm.Environment;
import dtm.data.Characters;
import java.util.Scanner;
import java.util.TimerTask;

/**
 *
 * @author rabiul
 */
public class Game {
   
    private Player user, robot;
    private Environment environment;
    
    private final Scanner sc = new Scanner(System.in);
    
    private int getUserInput = -1;
    private int getRobotShot = 0;
    
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
        }
    };
    
    private void init() {
        environment = new Environment();
        welcome();
        tutorial();
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome " + name);
        user = new Player(name);
        robot = new Player(Characters.gnashinator.getName());
        System.out.println("==============================");
        System.out.printf("%s VS %s\n", user.getName(), Characters.gnashinator.getName());
        System.out.println("==============================");
        choices();
    }
    
    private void welcome() {
        System.out.println("======================================");
        System.out.println("!!!!!!      SHOOT THE ROBOT     !!!!!!");
        System.out.println("======================================");
    }
    
    private void tutorial() {
        System.out.println("======================================");
        System.out.println("HOW TO PLAY");
        System.out.println("======================================");
        System.out.println("You begin the game with 30 health points each");
        System.out.println("After every 2 seconds the robot shoots");
        System.out.println("a random number (n) of bullets at you");
        System.out.println("Your job is to capture the bullets and use");
        System.out.println("them to shoot the robot.");
        System.out.println("You do this by typing the exact random number");
        System.out.println("within two seconds.");
        System.out.println("If you succeed you gain (n) coins and the");
        System.out.println("robots health drops by (n) points. Otherwise");
        System.out.println("you lose (n) health points ");
        System.out.println("=======================================");
    }
    
    private void round() {;
        System.out.println("            (Health - Points)");
        System.out.printf("%10s : (%2d - %2d)\n%10s : (%2d - %2d)\n", user.getName(), user.getHealth(), user.getPoints(), robot.getName(), robot.getHealth(), robot.getPoints());
        System.out.println("=============================");
        getRobotShot = Characters.gnashinator.shoot();
        getUserInput = sc.nextInt();
        if (getUserInput == -1 || getRobotShot != getUserInput) {
            System.out.println("You got shot " + getRobotShot + " times!!!!");
            user.setHealth(user.getHealth() - getRobotShot);
            robot.setPoints(robot.getPoints() + getRobotShot);
        }else {
            System.out.println("Great work, you gain " + getRobotShot + " points");
            robot.setHealth(robot.getHealth() - getRobotShot);
            user.setPoints(user.getPoints() + getRobotShot);
        }
        if (robot.getHealth() <= 0)  {
            System.out.println("===========================");
            System.out.println(":) YOU WIN THE GAME BY " + user.getPoints() + " POINTS");
            System.out.println("===========================");
            choices();
        }else if (user.getHealth() <= 0) {
            System.out.println("===========================");
            System.out.println(":( YOU LOST, BETTER LUCK NEXT TIME ");
            System.out.println("===========================");
            choices();
        }
    }
    
    private void game() {
        while (true) {            
            round();
        }
    }
    
    private void choices() {
        System.out.println("=================");
        System.out.println("Choices");
        System.out.println("1) New Game");
        System.out.println("2) Quit");
        int choice;
        do {
            System.out.println("Select one choice: ");
            choice = sc.nextInt();
        }while (!(choice == 1 || choice == 2));
        if (choice == 1) {
            game();
        }else {
            System.out.println("THANK YOU FOR PLAYING");
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        new Game().init();
    }
}
