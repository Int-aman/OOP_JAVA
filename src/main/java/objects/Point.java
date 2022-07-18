public class Point {
    private int x_coordinate;
    private int y_coordinate;

    public Point(int x_coordinate, int y_coordinate){
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }

    public void showLocation(){
        System.out.println("(" + x_coordinate + "," + y_coordinate + ")");
    }
}