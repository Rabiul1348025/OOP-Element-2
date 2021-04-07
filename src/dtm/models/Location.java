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
 * Solution to 1 d.
 * 
 * Location model contains the name of the location and 
 * a list of artifacts, which are the objects in the 
 * fictional universe, which can be stored in the given location.
 * 
 */
public class Location {
    private String name;
    private final List<Artifact> storage;

    public Location(String name) {
        this.name = name;
        this.storage = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void store(Artifact artifact) {
        storage.add(artifact);
    }
    
    public void remove(Artifact artifact) {
        storage.remove(artifact);
    }
    
    
}
