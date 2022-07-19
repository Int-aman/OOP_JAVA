package com.ultralesson.oopjava.objects.inheritence;

public class Trees extends Plants{
    private String forest;
    private boolean generateSeeds;
    private double height;
    private int age;
    public Trees(String commonName, String livingEcosystem, String species, boolean isVascular) {
        super(commonName, livingEcosystem, species, true);
    }
    public void setProperties(String forest, boolean generateSeeds, double height, int age){
        this.forest = forest;
        this.generateSeeds = generateSeeds;
        this.height = height;
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getForest() {
        return forest;
    }

    public boolean isGenerateSeeds() {
        return generateSeeds;
    }
}
