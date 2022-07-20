package com.ultralesson.oopjava.objects.recipeclasses;

public class PumpkinSoup {
    public PumpkinSoup(){
        System.out.println("Preparing pumpkin soup ...");
    }
    public PumpkinSoup heatingSaucepan(){
        System.out.println("Heating saucepan ...");
        return this;
    }
    public PumpkinSoup addingVegetables(int minutes){
        System.out.println("Added onions and leek");
        System.out.println("Stirring for "+minutes+" minutes");
        return this;
    }
    public PumpkinSoup addingSpices(){
        System.out.println("Adding garlic and spices");
        return this;
    }
    public PumpkinSoup addPumpkin(String otherVegetable, int simmerMinutes){
        System.out.println("Adding pumpkin with "+otherVegetable+". And boiling the soup.");
        System.out.println("Let the soup simmer for "+simmerMinutes+" minutes");
        return this;
    }
    public PumpkinSoup finishingUp(){
        System.out.println("Allow to cool slightly, then blend in batches.");
        System.out.println("Stir through cream and reheat gently");
        System.out.println("Season and Serve, Enjoy!!");
        return this;
    }

    public static void main(String[] args) {
        PumpkinSoup soup = new PumpkinSoup();
        soup
                .heatingSaucepan()
                .addingVegetables(4)
                .addingSpices()
                .addPumpkin("Potato",30)
                .finishingUp();
    }


}
