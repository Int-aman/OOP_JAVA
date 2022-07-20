package com.ultralesson.oopjava.objects.encapsulation;

public class Rectangle {
    private int length;
    private int width;
    //todo implement dimensions objects

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void increaseDimensions(){
        length += 1;
        width += 1;
    }

    public void increaseDimensions(int newLength, int newWidth){
        length = newLength;
        width = newWidth;
    }
//Todo separate function for length & width, getter and setter
}
