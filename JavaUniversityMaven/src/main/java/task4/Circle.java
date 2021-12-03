package task4;

public class Circle extends Shape {
    private double radius;

    public Circle() { radius = 1; }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() { return radius*radius*Math.PI; }

    @Override
    public double getPerimetr() {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", perimetr=" + getPerimetr() + ", area=" + getArea() + '}';
    }
}
