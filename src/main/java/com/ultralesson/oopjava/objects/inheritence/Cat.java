package com.ultralesson.oopjava.objects.inheritence;

public class Cat extends Animals{
    private String colour;
    private String breed;

    public Cat(String phylum, String livingEcosystem, String species) {
        super("Cat",phylum, livingEcosystem, species);
        this.breed = "Persian cat";
        this.colour = "Gray";
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public String getColour() {
        return colour;
    }
}
