package task3;

public class Circle {
    private double radius, lengthOfCircle, areaOfCircle;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return Math.round(100*radius)/100.0;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double getLengthOfCircle() {
        return Math.round(radius*2*Math.PI*100)/100.0;
    }

    public double getАreaOfCircle() {
        return Math.round(100*radius*radius*Math.PI)/100.0;
    }

}
