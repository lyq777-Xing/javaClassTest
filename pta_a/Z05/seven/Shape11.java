package Z05.seven;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lyq
 * @time 2023/12/15 20:44
 */
public class Shape11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("rect")){
                Rectangle rectangle = new Rectangle(sc.nextInt(), sc.nextInt());
                shapes.add(rectangle);
            } else if (s.equals("cir")) {
                Circle circle = new Circle(sc.nextInt());
                shapes.add(circle);
            }
        }
        System.out.println(sumAllPerimeter(shapes));
        System.out.println(sumAllArea(shapes));
        System.out.println(shapes.toString());
        for (Shape s:
             shapes) {
            System.out.println(s.getClass() + "," + s.getClass().getSuperclass());
        }
    }
    static double sumAllArea(ArrayList<Shape> shapes){
        double sum = 0;
        for (Shape s:
             shapes) {
            sum += s.getArea();
        }
        return sum;
    }
    static double sumAllPerimeter(ArrayList<Shape> shapes){
        double sum = 0;
        for (Shape s:
                shapes) {
            sum += s.getPerimeter();
        }
        return sum;
    }
}

abstract class Shape{
    public static double PI = 3.14;
    public double getPerimeter(){
        return 0;
    }
    public double getArea(){
        return 0;
    }
}

class Rectangle extends Shape{
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle [" +
                "width=" + width +
                ", length=" + length +
                ']';
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}

class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [" +
                "radius=" + radius +
                ']';
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
