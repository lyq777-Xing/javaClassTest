package Z04类的设计;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        double abscissa,ordinate;
        double length,width;
        int count = 0;
        Scanner input = new Scanner(System.in);
        abscissa = input.nextDouble();
        ordinate = input.nextDouble();
        length = input.nextDouble();
        width = input.nextDouble();
        count = input.nextInt();
        Rectangle rectangle = new Rectangle(new Coordinate(abscissa,ordinate),length,width);
        MonteCarloSimulation monteCarlo = new MonteCarloSimulation(rectangle);
        if(monteCarlo.validateRectangle()){
            monteCarlo.setCircle();
            if((Math.abs(monteCarlo.simulation(count) - Math.PI)) <= 1e-3){
                System.out.println("Success");
            }
            else{
                System.out.println("failed");
            }
        }else{
            System.out.println("Wrong Format");
        }
    }

    /**
     * 圆
     */
    static class Circle{
        private Coordinate coordinate;
        private double radius;

        public Circle() {
        }

        public Circle(Coordinate coordinate, double radius) {
            this.coordinate = coordinate;
            this.radius = radius;
        }

        public Coordinate getCoordinate() {
            return coordinate;
        }

        public void setCoordinate(Coordinate coordinate) {
            this.coordinate = coordinate;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
    }

    /**
     * 矩形
     */
    static class Rectangle{
        private Coordinate coordinate;
        private double length;
        private double width;

        public Rectangle() {
        }

        public Rectangle(Coordinate coordinate, double length, double width) {
            this.coordinate = coordinate;
            this.length = length;
            this.width = width;
        }

        public Coordinate getCoordinate() {
            return coordinate;
        }

        public void setCoordinate(Coordinate coordinate) {
            this.coordinate = coordinate;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }
    }

    /**
     * 坐标
     */
    static class Coordinate{
//        横坐标
        private double abscissa;
//        纵坐标
        private double ordinate;

        public Coordinate(double abscissa, double ordinate) {
            this.abscissa = abscissa;
            this.ordinate = ordinate;
        }

        public double getAbscissa() {
            return abscissa;
        }

        public void setAbscissa(double abscissa) {
            this.abscissa = abscissa;
        }

        public double getOrdinate() {
            return ordinate;
        }

        public void setOrdinate(double ordinate) {
            this.ordinate = ordinate;
        }
    }

    static class MonteCarloSimulation {
        private Rectangle rectangle;

        private Circle circle;

        public MonteCarloSimulation() {
        }

        public MonteCarloSimulation(Rectangle rectangle) {
            this.rectangle = rectangle;
        }

        public MonteCarloSimulation(Rectangle rectangle, Circle circle) {
            this.rectangle = rectangle;
            this.circle = circle;
        }

        public Rectangle getRectangle() {
            return rectangle;
        }

        public void setRectangle(Rectangle rectangle) {
            this.rectangle = rectangle;
        }

        public Circle getCircle() {
            return circle;
        }

        public void setCircle(Circle circle) {
            this.circle = circle;
        }

        public void setCircle() {
        }

        /**
         * 检验数据是否非法
         * @return
         */
        public boolean validateRectangle() {
            if(this.rectangle.getLength() != this.rectangle.getWidth() || this.rectangle.getWidth() <=0 || this.rectangle.getLength() <= 0){
                return false;
            }else {
                return true;
            }
        }


        public double simulation(int count) {
            int n = 0;
//            圆的半径
            double r = this.getRectangle().getWidth() / 2;
//            矩形左下角的y值
            double y = this.getRectangle().getCoordinate().getOrdinate() - this.getRectangle().getLength();
//            矩形右上角的x值
            double x = this.getRectangle().getCoordinate().getAbscissa() + this.getRectangle().getWidth();
//            随机数x的取值范围:左上角的x值到右上角的x值
//            随机数y的取值范围:左上角的y值到左下角的y值
            for (int i = 0; i < count; i++) {
                double x0=Math.random()*(getRectangle().getWidth())-(getRectangle().getWidth() / 2);
                double y0=Math.random()*(getRectangle().getWidth())-(getRectangle().getWidth() / 2);
                x0 = Math.abs(x0);
                y0 = Math.abs(y0);
                if(x0 * x0 + y0 * y0<= r * r){
                    n++;
                }
            }
            return 4.0 * n / count;
        }
    }
}
