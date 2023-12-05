import java.util.Scanner;

/**
 * @author lyq
 * @time 2023/11/23 23:52
 */
public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(isPerfect(n)){
            System.out.println(n + ":" + "Yes");
        }else {
            System.out.println(n + ":" + "No");
        }
    }
    public static boolean isPerfect(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if(n % i == 0){
                sum = sum + i;
            }
        }
        if(sum == n){
            return true;
        }else {
            return false;
        }
    }
}
