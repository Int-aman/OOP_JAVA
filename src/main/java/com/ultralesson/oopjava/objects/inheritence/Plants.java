package com.ultralesson.oopjava.objects.inheritence;

public class Plants {
    private String commonName;
    private String livingEcosystem;
    private String species;
    private boolean isVascular;

    public Plants(String commonName, String livingEcosystem, String species, boolean isVascular){
        this.commonName = commonName;
        this.livingEcosystem = livingEcosystem;
        this.species = species;
        this.isVascular = isVascular;
    }
    public String getCommonName(){return commonName;}
    public String getLivingEcosystem(){return livingEcosystem;}
    public String getSpecies(){return species;}

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public void setLivingEcosystem(String livingEcosystem) {
        this.livingEcosystem = livingEcosystem;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setVascular(boolean vascular) {
        isVascular = vascular;
    }

    public boolean getIsVascular() {
        return isVascular;
    }
}
