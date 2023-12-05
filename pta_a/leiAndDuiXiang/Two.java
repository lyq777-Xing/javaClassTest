package leiAndDuiXiang;

import java.util.Scanner;

/**
 * @author lyq
 * @time 2023/11/29 19:07
 */
public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        rectangle.setXY(sc.nextDouble(),sc.nextDouble());
        double area = rectangle.getArea();
        double perimeter = rectangle.getPerimeter();
        System.out.println("面积为" + area);
        System.out.println("周长为" + perimeter);
    }
    static class Rectangle{
        private double length;
        private double width;

        public Rectangle() {
        }

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public void setXY(double a,double b){
            this.length = a;
            this.width = b;
        }

        public double getArea(){
            return this.width * this.length;
        }

        public double getPerimeter(){
            return 2 * (this.width + this.length);
        }
    }
}
