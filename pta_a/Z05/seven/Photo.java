//package Z05.seven;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Objects;
//import java.util.Scanner;
//
//import static java.lang.Math.*;
//
///**
// * @author lyq
// * @time 2023/12/15 18:07
// */
//
//public class Photo {
//    //在Main类中定义一个静态Scanner对象，这样在其它类中如果想要使用该对象进行输入，则直接
//    //使用Main.input.next…即可（避免采坑）`
//    public static Scanner input = new Scanner(System.in);
//    public static void main(String[] args){
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        int num = input.nextInt();
//        while(num != 0){
//            if(num < 0 || num > 4){
//                System.out.println("Wrong Format");
//                System.exit(0);
//            }
//            list.add(num);
//            num = input.nextInt();
//        }
////            1代表圆形卡片，2代表矩形卡片，3代表三角形卡片，4代表梯形卡片
//        ArrayList<Card> cards = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            switch (list.get(i)){
//                case 0:
//                    break;
//                case 1:{
//                    Shape circle = new Circle(input.nextDouble());
//                    circle.setShapeName("Circle");
//                    Card card = new Card(circle);
//                    cards.add(card);
//                    break;
//                }
//                case 2:{
//                    Shape rectangle = new Rectangle(input.nextDouble(), input.nextDouble());
//                    rectangle.setShapeName("Rectangle");
//                    Card card = new Card(rectangle);
//                    cards.add(card);
//                    break;
//                }
//                case 3:{
//                    Shape triangle = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
//                    triangle.setShapeName("Triangle");
//                    Card card = new Card(triangle);
//                    cards.add(card);
//                    break;
//                }
//                case 4:{
//                    Shape trapezoid = new Trapezoid(input.nextDouble(), input.nextDouble(), input.nextDouble());
//                    trapezoid.setShapeName("Trapezoid");
//                    Card card = new Card(trapezoid);
//                    cards.add(card);
//                    break;
//                }
//            }
//        }
//        DealCardList dealCardList = new DealCardList(cards);
//        if(!dealCardList.validate()){
//            System.out.println("Wrong Format");
//            System.exit(0);
//        }
//        dealCardList.showResult();
//        input.close();
//    }
//}
//
//class Shape{
//    private String shapeName;
//
//    public Shape() {
//    }
//
//    public Shape(String shapeName) {
//        this.shapeName = shapeName;
//    }
//
//    public String getShapeName() {
//        return shapeName;
//    }
//
//    public void setShapeName(String shapeName) {
//        this.shapeName = shapeName;
//    }
//
//    @Override
//    public String toString() {
//        return "Shape{" +
//                "shapeName='" + shapeName + '\'' +
//                '}';
//    }
//
//    public double getArea(){
//        return 0;
//    }
//
//    public boolean validate(){
//        return true;
//    }
//}
//
//class Triangle extends Shape{
//    private double side1;
//    private double side2;
//    private double side3;
//
//    public Triangle() {
//    }
//
//    public Triangle(double side1, double side2, double side3) {
//        this.side1 = side1;
//        this.side2 = side2;
//        this.side3 = side3;
//    }
//
//    @Override
//    public double getArea() {
//        double p = ( side1 + side2 + side3) / 2;
//        return sqrt(p * (p - side1) * (p - side2) * (p - side3));
//    }
//
//    @Override
//    public boolean validate() {
//        if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1
//                && side1 >= 0 && side2 >= 0 && side3 >= 0){
//            return true;
//        }
//        return false;
//    }
//}
//
//class Rectangle extends Shape{
//    private double width;
//    private double length;
//
//    public Rectangle() {
//    }
//
//    public Rectangle(double width, double length) {
//        this.width = width;
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    @Override
//    public double getArea() {
//        return width * length;
//    }
//
//    @Override
//    public boolean validate() {
//        if(width >= 0 && length >= 0){
//            return true;
//        }
//        return false;
//    }
//}
//
//class Circle extends Shape{
//    private double radius;
//
//    public Circle() {
//    }
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public double getArea() {
//        return radius * radius * PI;
//    }
//
//    @Override
//    public boolean validate() {
//        if(radius >= 0){
//            return true;
//        }
//        return false;
//    }
//}
//
//class Trapezoid extends Shape{
//    private double topSide;
//    private double bottomSide;
//    private double height;
//
//    public Trapezoid() {
//    }
//
//    public Trapezoid(double topSide, double bottomSide, double height) {
//        this.topSide = topSide;
//        this.bottomSide = bottomSide;
//        this.height = height;
//    }
//
//    @Override
//    public double getArea() {
//        return (topSide + bottomSide) * height / 2;
//    }
//
//    @Override
//    public boolean validate() {
//        if(topSide >= 0 && bottomSide >= 0 && height >= 0){
//            return true;
//        }
//        return false;
//    }
//}
//
//class Card{
//    private Shape shape;
//
//    public Card() {
//    }
//
//    public Card(Shape shape) {
//        this.shape = shape;
//    }
//
//    public Shape getShape() {
//        return shape;
//    }
//
//    public void setShape(Shape shape) {
//        this.shape = shape;
//    }
//
//    public int compareTo(Card card){
//        double area = card.getShape().getArea();
//        double area1 = this.getShape().getArea();
//        if(area == area1){
//            return 0;
//        }
//        return area > area1 ? 1 : -1;
//    }
//}
//
//class DealCardList{
//    ArrayList<Card> cardList = new ArrayList<>();
//
//    public DealCardList() {
//    }
//
//    public DealCardList(ArrayList<Card> cardList) {
//        this.cardList = cardList;
//    }
//
//
//    public boolean validate(){
//        for (Card card:
//             cardList) {
//            if (!card.getShape().validate()){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public void cardSort(){
//
//    }
//
//    public double getAllArea(){
//        double sum = 0;
//        for (Card c :
//                cardList) {
//            sum += c.getShape().getArea();
//        }
//        return sum;
//    }
//
//    public void showResult(){
//        System.out.println("The original list:");
//        for (int i = 0; i < cardList.size() - 1; i++) {
//            System.out.printf("%s:%.2f ",cardList.get(i).getShape().getShapeName(),cardList.get(i).getShape().getArea());
//        }
//        System.out.printf("%s:%.2f \n",cardList.get(cardList.size() - 1).getShape().getShapeName(),cardList.get(cardList.size() - 1).getShape().getArea());
//        System.out.println("The sorted list:");
//        cardList.sort(Card::compareTo);
//        for (int i = 0; i < cardList.size() - 1; i++) {
//            System.out.printf("%s:%.2f ",cardList.get(i).getShape().getShapeName(),cardList.get(i).getShape().getArea());
//        }
//        System.out.printf("%s:%.2f \n",cardList.get(cardList.size() - 1).getShape().getShapeName(),cardList.get(cardList.size() - 1).getShape().getArea());
//        System.out.printf("Sum of area:%.2f",getAllArea());
//    }
//
//}
//
//
//
