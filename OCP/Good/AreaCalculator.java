package OCP.Good;

interface Shape {
    double area();
}

public class AreaCalculator {
     double area(Shape s) { return s.area(); }
    
}
 class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}