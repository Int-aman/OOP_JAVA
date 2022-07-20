package com.ultralesson.oopjava.objects.constructors;

public class Apples {
    private String type; //todo object of apple_type
    private String taste;//todo object of apple_taste

    public Apples(){
        this.type = "Golden Delicious";
        this.taste = "Sweet";
    }
    public Apples(String type, String taste){
        if(type.length() != 0) this.type = type;
        else this.type = "HoneyCrisp";

        if(taste.length() != 0) this.taste = taste;
        else this.taste = "Sweet";
    }
}
