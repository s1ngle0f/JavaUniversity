package task6_;

public class Main {

    public static void main(String[] args)
    {
        Circle circle = new Circle( 4, "blue", true);
        System.out.println(circle.toString());

        MovableCircle movableCircle = new MovableCircle(1, 1, 4, "blue", true);
        movableCircle.move(1, 2);
        System.out.println(movableCircle.toString());

        Rectangle rectangle = new Rectangle(1, 3, "red", false);
        System.out.println(rectangle.toString());

        Square square = new Square(3, "green", true);
        System.out.println(square.toString());

        MovablePoints movablePoints = new MovablePoints();
        System.out.println(movablePoints.getArea());
        System.out.println(movablePoints.getPerimetr());
    }
}
