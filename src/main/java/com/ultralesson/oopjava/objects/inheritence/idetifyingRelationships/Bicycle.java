package com.ultralesson.oopjava.objects.inheritence.idetifyingRelationships;

public class Bicycle {
    private double height;

    private Wheels wheels;
    private Brakes brakes;
    private Pedals pedals;

    public Bicycle(double height){
        this.height = height;

        this.brakes = new Brakes();
        this.pedals = new Pedals();
        this.wheels = new Wheels();
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public void setBrakes(Brakes brakes) {
        this.brakes = brakes;
    }

    public Pedals getPedals() {
        return pedals;
    }

    public void setPedals(Pedals pedals) {
        this.pedals = pedals;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
