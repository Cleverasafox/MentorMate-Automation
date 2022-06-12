package Lesson_9_Introduction_to_OOP.Lesson_9_Introduction_to_OOP_Shapes;

public class Rectangle extends  Shape{

  private   double length;
  private double width;

  public Rectangle (double length, double width,String color, boolean filled){
      super(color,filled);
      this.width=length;
      this.length=width;
      System.out.println("This is the constructor for Rectangle");
  }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
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

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return ((2*length)+(2*width));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
