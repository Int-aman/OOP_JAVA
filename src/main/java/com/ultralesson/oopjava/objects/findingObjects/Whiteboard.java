package com.ultralesson.oopjava.objects.findingObjects;

public class Whiteboard {
    private double length;
    private double width;
    private double surface_area;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSurface_area() {
        return surface_area;
    }

    public void setSurface_area(double surface_area) {
        this.surface_area = surface_area;
    }

    public Whiteboard(double surface_area, double length, double width){
        this.length = length;
        this.width = width;
        this.surface_area = surface_area;
    }

    public void write(){
        System.out.println("Whiteboard is being used with a black marker");
    }
    public void erase(){
        System.out.println("Whiteboard is erased you can start afresh");
    }

}