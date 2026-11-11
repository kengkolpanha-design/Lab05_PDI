class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findSurface() {
        return Math.PI * radius * radius;
    }

    public double findPerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5.0, 10.0);
        System.out.println("--- Rectangle ---");
        System.out.println("Area: " + myRectangle.calculateArea());
        System.out.println("Perimeter: " + myRectangle.calculatePerimeter());

        Circle myCircle = new Circle(7.0);
        System.out.println("\n--- Circle ---");
        System.out.println("Surface: " + myCircle.findSurface());
        System.out.println("Perimeter: " + myCircle.findPerimeter());
    }
}