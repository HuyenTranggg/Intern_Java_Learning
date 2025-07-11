package Java_core.Practice.practice1;

public class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    super(radius * 2, radius * 2);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getCircumference() {
    return 2 * 3.14 * radius;
  }
}
