import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * @author lyq
 * @time 2023/11/23 23:49
 */
public class three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();
        if(inCircle(x, y, r)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
    private static boolean inCircle(int x, int y, int r){
        if(sqrt(x * x + y * y) < r){
            return true;
        }else {
            return false;
        }
    }
}
