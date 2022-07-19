package com.ultralesson.oopjava.objects;

public class Hairstyles {
    private String colour;
    private String style;

    public Hairstyles(){
        this.colour = "Brown";
        this.style = "Slick Back";
    }
    public Hairstyles(String colour, String style){
        if(colour.length() != 0) this.colour = colour;
        else this.colour = "Black";

        if(style.length() != 0) this.style = style;
        else this.style = "Buzz cut";
    }
}
