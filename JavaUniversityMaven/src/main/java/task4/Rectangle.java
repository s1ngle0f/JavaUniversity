package task4;

public class Rectangle extends Shape {
    private double width, length;

    public Rectangle() {
        width = 1;
        length = 1;
    }

    public Rectangle(double a, double b) {
        this.width = a;
        this.length = b;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double a) {
        this.width = a;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double b) {
        this.length = b;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimetr() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", perimetr=" + getPerimetr() + ", area=" + getArea() + '}';
    }
}
