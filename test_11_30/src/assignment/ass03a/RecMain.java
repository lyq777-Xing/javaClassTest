package assignment.ass03a;

import java.util.Scanner;

/**
 * @author lyq
 * @time 2023/11/30 18:52
 */
public class RecMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("请输入长方形的长：");
        rectangle.setLength(sc.nextDouble());
        System.out.println("请输入长方形的宽：");
        rectangle.setWidth(sc.nextDouble());
        System.out.println("该长方形的信息为：" + rectangle.show());
        System.out.println("该长方形的面积为：" + rectangle.getArea());
    }
}
