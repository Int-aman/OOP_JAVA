package com.ultralesson.oopjava.objects.inheritence.idetifyingRelationships;

public class Ruler {
    private double length;
    public Ruler(int length){
        this.length = length;
    }

    public void measuring(){
        System.out.println("Measuring things...");
    }

    public double getLength() {
        return length;
    }
}
