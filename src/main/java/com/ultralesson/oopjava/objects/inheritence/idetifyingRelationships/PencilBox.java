package com.ultralesson.oopjava.objects.inheritence.idetifyingRelationships;

public class PencilBox {
    private double length;
    private double width;
    private final double depth = 4;

    private Pencil pencil;
    private Eraser eraser;
    private Ruler ruler;
    private Sharpener sharpener;

    public PencilBox(int length, int width){
        this.length = length;
        this.width = width;

        this.pencil = new Pencil(15,"Black","HB");
        this.eraser = new Eraser();
        this.ruler = new Ruler(15);
        this.sharpener = new Sharpener();
    }

    public double getDepth() {
        return depth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Pencil getPencil() {
        return pencil;
    }

    public void setPencil(Pencil pencil) {
        this.pencil = pencil;
    }

    public Eraser getEraser() {
        return eraser;
    }

    public void setEraser(Eraser eraser) {
        this.eraser = eraser;
    }

    public Ruler getRuler() {
        return ruler;
    }

    public void setRuler(Ruler ruler) {
        this.ruler = ruler;
    }

    public Sharpener getSharpener() {
        return sharpener;
    }

    public void setSharpener(Sharpener sharpener) {
        this.sharpener = sharpener;
    }
}
