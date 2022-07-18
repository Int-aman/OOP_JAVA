package objects;

public class GeometricShapes {
    private String shape_name;
    private int numberOfSides;
    private double area;
    private double perimeter;

    public GeometricShapes(String shape_name, int numberOfSides, double area, double perimeter){
        this.area = area;
        this.shape_name = shape_name;
        this.numberOfSides = numberOfSides;
        this.perimeter = perimeter;
    }

    public void showDetails(){
        System.out.println("Shape Name: " + shape_name);
        System.out.println("Total area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Number of sides: " + numberOfSides);
    }
}