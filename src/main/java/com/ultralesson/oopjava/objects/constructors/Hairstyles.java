package com.ultralesson.oopjava.objects.constructors;

public class Hairstyles {
    private String colour;//todo implement using object - hairstyle
    private String style;// todo implement using object - colour

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
