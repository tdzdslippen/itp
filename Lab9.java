import static java.lang.Math.sqrt;

abstract class Shape{
    public abstract double area();
    public abstract double perimeter();

}

class Circle extends Shape{
    double radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public double area(){
        return radius*radius*Math.PI;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double area() {
        double s = (sideA + sideB + sideC) / 2;
        return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }
}

class Square{
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4*side;
    }
}

class Ellipse{
    double a;
    double b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b * Math.PI;
    }

    public double perimeter() {
        return 2 * Math.PI * sqrt((a*a+b*b)/2);
    }
}

public class Lab9 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(20, 20);
        Triangle triangle = new Triangle(20, 20, 20);
        Square square = new Square(20);
        Ellipse ellipse = new Ellipse(20, 20);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
        System.out.println("Ellipse Area: " + ellipse.area());
        System.out.println("Ellipse Perimeter: " + ellipse.perimeter());
    }
}
