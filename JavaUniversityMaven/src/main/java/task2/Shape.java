package task2;

public class Shape {
    public String type;

    public Shape(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                '}';
    }
}
