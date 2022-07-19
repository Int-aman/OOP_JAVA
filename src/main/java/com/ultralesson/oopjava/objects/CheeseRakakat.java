package com.ultralesson.oopjava.objects;


public class CheeseRakakat {
    public CheeseRakakat(){
        System.out.println("Get the following ingredients 1.Cheese 2.Oregano 3.Sesame seeds 4.Coriander leaves");
    }
    public CheeseRakakat mixing(){
        System.out.println("Mixing the above mentioned ingredients");
        return this;
    }
    public CheeseRakakat rollingAndFolding(){
        System.out.println("Spread the filling on a sheet roll it over to form a log and seal the edges");
        System.out.println("Repeat the process for all the rolls");
        return this;
    }
    public CheeseRakakat cooking(){
        System.out.println("Deep fry the prepared cheese rolls until golden");
        return this;
    }
    public CheeseRakakat serving(String dip){
        System.out.println("Enjoy your Cheese rolls with "+dip+"!");
        return this;
    }
}
