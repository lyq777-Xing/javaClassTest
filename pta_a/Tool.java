import java.util.Scanner;

/**
 * @author lyq
 * @time 2023/11/23 17:05
 */
public class Tool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = n;
        int i = 0;
        for (;;) {
            i++;
            num = num / 10;
            if(num == 0){
                break;
            }
        }
        if(i != 3){
            System.out.println("error");
        }else {
            if(isDaffodil(n)){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
        System.out.println(153);
        System.out.println(370);
        System.out.println(371);
        System.out.println(407);
    }
    private static boolean isDaffodil(int n){
        int sum = 0;
        int i = n;
        if(n == 0){
            return false;
        }
        while(n != 0){
            int a = n % 10;
            a = a * a * a;
            sum = sum + a;
            n = n / 10;
        }
        if(sum == i){
            return true;
        }else {
            return false;
        }
    }
}
