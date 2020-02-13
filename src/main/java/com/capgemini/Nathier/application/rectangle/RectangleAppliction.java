package com.capgemini.Nathier.application.rectangle;

public class RectangleAppliction {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(3,10);
        Rectangle rectangle2=new Rectangle(5,6);

        System.out.println("Calculate surface:"+rectangle1.calculatesurface());
        System.out.println("Calculate circumference:"+rectangle1.CalculateCircumference());

        System.out.println("Calculate surface:"+rectangle2.CalculateCircumference());
        System.out.println("Calculate circumference:"+rectangle2.CalculateCircumference());
        System.out.println(rectangle1.toString());





    }
}
