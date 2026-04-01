// Ex7-a Data abstraction with abstract class and interface
public class AbstractionDemo {
    public static void main(String[] args) {
        Shape shape = new Circle(4.0);
        shape.draw();
        System.out.println("Area: " + shape.area());
    }
}

abstract class Shape {
    abstract double area();

    void draw() {
        System.out.println("Drawing shape");
    }
}

interface Colorable {
    String getColor();
}

class Circle extends Shape implements Colorable {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return "Blue";
    }
}
