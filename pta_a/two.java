import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * @author lyq
 * @time 2023/11/23 23:06
 */
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] eqn = new double[3];
        double[] roots = new double[2];
        for (int i = 0; i < 3; i++) {
            if(sc.hasNextDouble()){
                eqn[i] = sc.nextDouble();
            }else {
                System.out.println("Wrong Format");
                System.exit(0);
            }
        }
        if(eqn[0] == 0){
            System.out.println("Wrong Format");
            System.exit(0);
        }else {
            int i = solveQuadratic(eqn, roots);
            if(i == -1){
                System.out.println("The equation has no roots");
            } else if (i == 0) {
                System.out.printf("The equation has one root: %.4f\n",roots[0]);
            }else {
                System.out.printf("The equation has two roots: %.4f and %.4f\n",roots[0],roots[1]);
            }
        }
    }
    public static int solveQuadratic(double[] eqn, double[] roots){
        double d = eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2];
        if(d < 0){
            return -1;
        } else if (d > 0) {
            roots[1] = (-1 * eqn[1] - sqrt(d) )/ (2.0 * eqn[0]);
            roots[0] = (-1 * eqn[1] + sqrt(d)) / (2.0 * eqn[0]);
            return 1;
        }else {
            roots[0] = (-1 * eqn[1]) / (2.0 * eqn[0]);
            if(roots[0] == 0){
                roots[0] = 0;
            }
            return 0;
        }
    }
}
