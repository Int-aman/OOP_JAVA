package com.ultralesson.oopjava.objects.inheritence.idetifyingRelationships;

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
        System.out.println("Pencil is sharpened.");
        length -= 1;
    }

    public int getLength() {

        return length;
    }

    public void setLength(int length) {

        this.length = length;
    }

    public String getColour() {

        return Colour;
    }

    public void setColour(String colour) {

        Colour = colour;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }
}
