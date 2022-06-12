package Lesson_9_Introduction_to_OOP.Lesson_9_Introduction_to_OOP_Shapes;

import static java.lang.Math.PI;

public class Circle extends Shape {
  private  double radius;

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
        System.out.println("This is the constructor for Circle");


    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
