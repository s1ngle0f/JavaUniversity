package task6_;

public class MovableCircle extends Circle implements Movable {

    public MovableCircle(int x, int y, double radius) {
        super(radius);
        this.setX(x);
        this.setY(y);
    }

    public MovableCircle(int x, int y, double radius, String color, boolean filled) {
        super(radius, color, filled);
        this.setX(x);
        this.setY(y);
    }

    @Override
    public void move(int x, int y) {
        this.setX(getX() + x);
        this.setY(getY() + y);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + getRadius() +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", perimetr=" + getPerimetr() + ", area=" + getArea() + ", X=" + getX() + ", Y=" + getY() +'}';
    }
}
