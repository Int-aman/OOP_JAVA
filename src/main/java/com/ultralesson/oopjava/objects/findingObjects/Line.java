package com.ultralesson.oopjava.objects.findingObjects;

public class Line {
    private double length;
    private String colour;

    public Line(double length, String colour){
        this.length = length;
        this.colour = colour;
    }

    public void drawLine(double increaseInLength){
        length += increaseInLength;
    }

    public void eraseLine(double decreaseInLength){
        length -= decreaseInLength;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getLength() {
        return length;
    }

    public String getColour() {
        return colour;
    }
}