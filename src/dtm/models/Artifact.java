/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtm.models;

/**
 *
 * @author rabiul
 */
public class Artifact {
    private String name;
    private final ArtifactUser user;
    
    public Artifact(String name, ArtifactUser user) {
        System.out.printf("Creating Artifact %s\n", name);
        this.name = name;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArtifactUser getUser() {
        return user;
    }
}
