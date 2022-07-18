public class Whiteboard {
    private double size;

    public Whiteboard(double size){
        this.size = size;
    }

    public void write(){
        System.out.println("Whiteboard is being used with a black marker");
    }
    public void erase(){
        System.out.println("Whiteboard is erased you can start afresh");
    }

}