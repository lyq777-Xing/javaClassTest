package assignment.ass01;

import java.util.Scanner;

/**
*@author lyq
*@version 2023年11月18日下午4:33:17
*（求一个整数各位数的和）编写程序，读取一个0和1000之间的整数，并将该整数的各位数字相加。
*/
public class Sum_11_18 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between [0, 1000]：");
        int i = scanner.nextInt();
        int sum = 0;
//        如果i不属于正常返回 输出错误 
        if(i > 1000 || i < 0) {
        	System.out.println("The num is error!");
        }else {
        	while(i != 0) {
        		sum = sum + i % 10;
        		i = i /10;
        	}
        	System.out.println("The sum of the digits is " + sum);
        }
    	
	}

}
