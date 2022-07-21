package com.ultralesson.oopjava.objects.inheritence.idetifyingRelationships;

public class Pen {
    private Colour colour;
    private Ink ink;
    private PenCap penCap;

    public void write(){
        System.out.println("Writing using pen...");
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public PenCap getPenCap() {
        return penCap;
    }

    public void setPenCap(PenCap penCap) {
        this.penCap = penCap;
    }
}
