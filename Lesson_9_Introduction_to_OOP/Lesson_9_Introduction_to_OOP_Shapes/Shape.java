package Lesson_9_Introduction_to_OOP.Lesson_9_Introduction_to_OOP_Shapes;

import static java.lang.Math.PI;

public abstract class Shape {

String color;

boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        System.out.println("This is the constructor for shape");
    }

    public abstract double getArea();

public  abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
