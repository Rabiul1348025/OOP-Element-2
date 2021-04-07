/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtm;

import static dtm.data.Characters.*;
import static dtm.data.Artifacts.*;
import static dtm.data.Locations.*;
import dtm.models.Adult;
import dtm.models.Artifact;
import dtm.models.ArtifactUser;
import dtm.models.Bird;

import dtm.models.Child;
import dtm.models.Dog;
import dtm.models.Location;
import dtm.models.Pet;
import dtm.models.Pigs;
import dtm.models.Robot;

/**
 *
 * @author rabiul
 * 
 * Solution to Task 2 a.
 */
public class Environment {
    
    public Environment() {
        run();
    }
    /**
     * Task 2. a
     */
    private void createCharacters() {
        dennisMenace = new Child(10, "Male", "Dennis Menace", "Boy");
        sandraMenace = new Adult(38, "Female", "Sandra Menace", "Dennis' Mom");
        dennisMenaceSr = new Adult(40, "Male", "Dennis Menace Snr", "Dennis' Dad");
        beaMenace = new Child(1, "Female", "Bea Menace", "Girl");
        grannyMenace = new Adult(65, "Female", "Granny Menace", "Granny");
        
        walterBrown = new Adult(10, "Male", "Walter Brown", "Dennis' Enemy");
        wilburBrown = new Adult(49, "Male", "Wilbur Brown", "Walter's Dad");
        
        carolCreecher = new Adult(93, "Female", "Carol Creecher", "Teacher");
        peterShepherd = new Adult(10, "Male", "Peter Shepherd", "Pie Face");
        sergeantSlipper = new Adult(40, "Male", "Sergeant Slipper", "Police");
        godfrey = new Adult(31, "Male", "Godfrey", "Militant");
        
        gnasher = new Dog("Gnasher", 2);
        joeTheCrow = new Bird("Joe the Bird", 2);
        gnipper = new Dog("Gnipper", 2);
        rasher = new Pigs("Rasher", 2);
        
        gnashinator = new Robot("Gnashnator");
    }
    
    private void createLocations() {
        frontRoom = new Location("Front Room");
        treeHouse = new Location("Tree House");
        park = new Location("Park");
        mi13SecretServiceHQ = new Location("MI3 Secret Service HQ");
        bashStreetSchool = new Location("Bash Street School");
    }
    
    private void createArtifacts() {
        catapults = new Artifact("Catapults", ArtifactUser.CHILDREN);
        skateBoards = new Artifact("Skate Board", ArtifactUser.CHILDREN);
        sausages = new Artifact("Sausages", ArtifactUser.BOTH);
        disguises = new Artifact("Disguises", ArtifactUser.BOTH);
        pies = new Artifact("Pies", ArtifactUser.BOTH);
    }
    
    /**
     * Task 2 a. 
     */
    private void addPetsToCharacters() {
        dennisMenace.addPet(new Pet(gnasher, dennisMenace));
        dennisMenace.addPet(new Pet(joeTheCrow, dennisMenace));
        dennisMenace.addPet(new Pet(rasher, dennisMenace));
        
        grannyMenace.addPet(new Pet(gnipper, grannyMenace));
        
    }
    
    /**
     * Task 2 d. Store artifacts in locations
     */
    private void addArtifactsToLocations() {
        Artifact pie1 = new Artifact("Pie", ArtifactUser.BOTH);
        Artifact pie2 = new Artifact("Pie", ArtifactUser.BOTH);
        
        treeHouse.store(pie1);
        treeHouse.store(pie2);
    }
    
    private void initVariables() {
        createCharacters();
        createLocations();
        createArtifacts();
        addPetsToCharacters();
        addArtifactsToLocations();
    }
    
    private void run() {
        initVariables();
    }
    
    public static void main(String[] args) {
        new Environment().run();
    }
}
