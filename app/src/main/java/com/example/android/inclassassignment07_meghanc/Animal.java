package com.example.android.inclassassignment07_meghanc;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private String numLegs;
    private boolean hasFur;
    private String funFact;

    //Constructor
    public Animal(String tempName, String tempLegs, boolean tempFur, String tempFact) {
        this.name = tempName;
        this.numLegs = tempLegs;
        this.hasFur = tempFur;
        this.funFact = tempFact;
    }

    //Setters
    public void setName(String newName) {
        name = newName;
    }

    public void setLegs(String newLegs) {
        numLegs = newLegs;
    }

    public void setFur(boolean newFur) {
        hasFur = newFur;
    }

    public void setFunFact(String newFact) {
        funFact = newFact;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getNumLegs() {
        return numLegs;
    }

    public boolean getHasFur() {
        return hasFur;
    }

    public String getFunFact() {
        return funFact;
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\nNumber of Legs: " + numLegs + "\nHas Fur: " + hasFur + "\nFun Fact: " + funFact;
    }

    /**
     * Created by mclark on 3/8/18.
     */

    public static interface Keys {
        String ANIMAL = "animal";
        String STRING = "string";
    }
}