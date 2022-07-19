package com.ultralesson.oopjava.objects;
public class Pencil {
    private int length;
    private String Colour;
    private String type;

    public Pencil(int length, String Colour, String type){
        this.length = length;
        this.Colour = Colour;
        this.type = type;
    }

    public void write(){
        System.out.println("Pencil is being used for writing.");
    }

    public void sharpen(){
        System.out.println("Pencil is sharpenend.");
        length -= 1;
    }
}