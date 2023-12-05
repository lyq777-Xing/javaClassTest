package assignment.ass03a;

/**
 * @author lyq
 * @time 2023/11/30 18:49
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
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

    /**
     * 计算长方形的面积
     * @return
     */
    public double getArea(){
        return this.width * this.length;
    }

    /**
     * 长方柱的信息和面积
     * @return
     */
    public String show(){
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + this.getArea() +
                '}';
    }
}
