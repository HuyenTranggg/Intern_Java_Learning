package Java_core.Practice.practice1;

public class Main {
  public static void main(String[] args) {
    Shape shape = new Shape(10, 15);
    Rectangle rectangle = new Rectangle(10, 15);
    Circle circle = new Circle(7);

    System.out.println("Shape - Width: " + shape.getWidth() + ", Height: " + shape.getHeight());
    System.out.println("Rectangle - Width: " + rectangle.getWidth() + ", Height: " + rectangle.getHeight() +
                       ", Area: " + rectangle.getArea() + ", Perimeter: " + rectangle.getPerimeter());
    System.out.println("Circle - Radius: " + circle.getRadius() + ", Area: " + circle.getArea() +
                       ", Circumference: " + circle.getCircumference());         
  }
}
