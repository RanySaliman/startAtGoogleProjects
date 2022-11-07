package Day3.Exc1;

public class Circle implements Figure {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * (radius * radius);
    }
}
