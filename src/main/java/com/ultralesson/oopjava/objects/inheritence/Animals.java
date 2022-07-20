package com.ultralesson.oopjava.objects.inheritence;

public class Animals {
    private boolean carnivorous;
    private String commonName;
    private String phylum;
    private String livingEcosystem;
    private String species;

    public Animals(String commonName, String phylum, String livingEcosystem, String species){
        this.phylum = phylum;
        this.livingEcosystem = livingEcosystem;
        this.species = species;
        this.commonName = commonName;
    }

    public void setCarnivorous(boolean carnivorous) {
        this.carnivorous = carnivorous;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public void setLivingEcosystem(String livingEcosystem) {
        this.livingEcosystem = livingEcosystem;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean getIsCarnivorous(){return carnivorous;}
    public String getCommonName(){return commonName;}
    public String getPhylum(){return phylum;}
    public String getLivingEcosystem(){return livingEcosystem;}
    public String getSpecies(){return species;}

}
