package com.ultralesson.oopjava.objects.findingObjects;
public class Box {

    private double height;
    private double breadth;
    private double length;
    private boolean isFull;
    private boolean isEmpty;
    private String material;

    public Box(double height, double breadth, double length, String material){
        this.height = height;
        this.breadth = breadth;
        this.length = length;
        this.material = material;
        isEmpty = true;
        isFull = false;
    }

    public double getVolume(){
        double volume = height*length*breadth;
        return volume;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    //getters

    public double getHeight() {
        return height;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getLength() {
        return length;
    }

    public boolean isFull() {
        return isFull;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public String getMaterial() {
        return material;
    }
}