package com.ultralesson.oopjava.objects.encapsulation;


public class BoyAge {
    private int age;
    public BoyAge(int age){
        if(validateAge(age))
            this.age = age;
        else
            this.age = 1;
    }
    public void increaseAgeBy(int addYears){
        if(validateAge(addYears))
            this.age += addYears;
    }
    public boolean validateAge(int age){
        return age>0;
    }
    public int getAge() {
        return age;
    }
}
