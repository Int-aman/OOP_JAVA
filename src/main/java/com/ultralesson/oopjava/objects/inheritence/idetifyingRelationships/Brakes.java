package com.ultralesson.oopjava.objects.inheritence.idetifyingRelationships;

public class Brakes {
    private String type;

    public void braking(){
        System.out.println("Applying brakes...");
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
