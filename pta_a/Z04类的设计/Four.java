package Z04类的设计;

import java.util.Scanner;

/**
 * @author lyq
 * @time 2023/12/7 23:38
 */
public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(i == 0){
                arr[i] = sc.nextInt();
                index++;
            }else {
                int num = sc.nextInt();
                int flag = 0;
                for (int j = 0; j < index; j++) {
                    if(arr[j] == num){
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0){
                    arr[index] = num;
                    index++;
                }
            }
        }
        for (int i = 0; i < index-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[index-1]);
    }
}
