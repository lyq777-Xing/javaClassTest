package assignment.ass02x;

import java.util.Scanner;

/**
 *@author lyq
 *@time 2023/11/24 21:46
 */
public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = sc.next();
        System.out.println("请输入需要查找的字符:");
        char a =  sc.next().charAt(0);
        System.out.println("字符"+ a + "出现的次数为：" + count(str,a));
    }
    public static int count(String str, char a){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == a){
                count++;
            }
        }
        return count;
    }
}
