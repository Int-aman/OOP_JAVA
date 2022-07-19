package com.ultralesson.oopjava.objects;
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
    }

    public double showVolume(){
        double volume = height*length*breadth;
        System.out.println(volume);
        return volume;
    }

}