package task4;

public class Main {

    public static void main(String[] args)
    {
        Circle circle = new Circle(4, "blue", true);
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle(1, 3, "red", false);
        System.out.println(rectangle.toString());
        Square square = new Square(3, "green", true);
        System.out.println(square.toString());
    }
}
