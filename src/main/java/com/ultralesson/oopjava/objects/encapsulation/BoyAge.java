package com.ultralesson.oopjava.objects.encapsulation;

import javax.swing.*;

public class BoyAge {
    private int age;

    public BoyAge(int age){
        if(age > 0) this.age = age;
        else this.age = 1;
    }
//TODO DRY,getter
    public void increaseAgeBy(int addYears){
        if(addYears > 0) this.age += addYears;
    }
}
