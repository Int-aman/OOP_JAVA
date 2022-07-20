package com.ultralesson.oopjava.objects.encapsulation;

public class Rectangle {
    private int length;
    private int width;
    //todo implement dimensions objects

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void increaseWidth(){
        width += 1;
    }
    public void increaseLength(){
        length += 1;
    }

    public void increaseWidthBy(int width) {
        if(width>0)
            this.width += width;
    }

    public void increaseLengthBy(int length) {
        if(length>0)
            this.length += length;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
