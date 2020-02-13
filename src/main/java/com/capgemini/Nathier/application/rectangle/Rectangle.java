package com.capgemini.Nathier.application.rectangle;

public class Rectangle {

    private int height;
    private int width;
    private  String color="no color";

    public Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int calculatesurface(){
        return height*width;
     }
     public int CalculateCircumference(){
       return 2*width+2*height;
     }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }
}

