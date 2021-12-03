package task6_;

public class MovablePoints extends Shape implements Movable{
    MovablePoint point0, point1;

    public MovablePoints() {
        point0 = new MovablePoint(0, 0);
        point1 = new MovablePoint(1, 1);
    }

    public MovablePoints(MovablePoint point0, MovablePoint point1) {
        this.point0 = point0;
        this.point1 = point1;
    }

    public MovablePoints(int x, int y, String color, boolean filled) {
        super(color, filled);
        this.x = x;
        this.y = y;
    }

    public double getWidth() {
        return Math.abs((point1.getX()-point0.getX()));
    }

    public void setWidth(int x) {
        point1.setX(point0.getX() + x);
    }

    public double getLength() {
        return Math.abs((point1.getY()-point0.getY()));
    }

    public void setLength(int y) {
        point1.setY(point0.getY() + y);
    }

    @Override
    public void move(int x, int y) {
        point0.move(x,y);
        point1.move(x,y);
    }

    @Override
    public double getArea() {
        return Math.abs((point1.getX()-point0.getX())*(point1.getY()-point0.getY()));
    }

    @Override
    public double getPerimetr() {
        return (Math.abs((point1.getX()-point0.getX()))+Math.abs((point1.getY()-point0.getY())))*2;
    }
}
