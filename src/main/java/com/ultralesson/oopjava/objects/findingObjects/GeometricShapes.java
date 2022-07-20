package com.ultralesson.oopjava.objects.findingObjects;

public class GeometricShapes {
    private String shapeName;
    private int numberOfSides;
    private double area;
    private double perimeter;

    public GeometricShapes(String shape_name, int numberOfSides, double area, double perimeter){
        this.area = area;
        this.shapeName = shape_name;
        this.numberOfSides = numberOfSides;
        this.perimeter = perimeter;
    }

    public void showDetails(){
        System.out.println("Shape Name: " + shapeName);
        System.out.println("Total area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Number of sides: " + numberOfSides);
    }
    // TODO - Implement area(),perimeter() function
}