package assignment.ass03a;

import java.util.Scanner;

/**
 * @author lyq
 * @time 2023/11/30 18:43
 */
public class TreeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一棵树的年龄:");
        Tree tree = new Tree(sc.nextInt());
        System.out.println("请输入第二棵树的年龄:");
        Tree tree1 = new Tree(sc.nextInt());
        if(tree1.getAge() > tree.getAge()){
            tree.grow(10);
        }else {
            tree1.grow(10);
        }
        System.out.println("第" + (tree1.getAge() > tree.getAge() ? "1" : "2") + "棵树年龄较小");
    }
}
