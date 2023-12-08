package leiAndDuiXiang;

import java.util.Scanner;

/**
 * @author lyq
 * @time 2023/12/6 13:33
 */
public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(), in.nextInt());
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.plus(b));
        System.out.println(a.multiply(b).plus(new Fraction(5,6)));
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.toDouble());
        in.close();
    }

    /* 请在这里填写答案 */
    static class Fraction{
        private int fengmu;
        private int fengzi;
        public Fraction(int a, int b) {
            this.fengzi = a;
            this.fengmu = b;
        }

        public Fraction() {
        }

        public double toDouble(){
            return (double) ( this.fengzi / this.fengmu );
        }

        public Fraction plus(Fraction r){
            Fraction fraction = new Fraction(0,0);
            fraction.fengzi = this.fengzi * r.fengmu +  r.fengzi * this.fengmu;
            fraction.fengmu = this.fengmu * r.fengmu;
            return fraction;
        }

        public Fraction multiply(Fraction r){
            Fraction fraction = new Fraction(0,0);
            fraction.fengzi = this.fengzi * r.fengzi;
            fraction.fengmu = this.fengmu * r.fengmu;
            return fraction;
        }

        @Override
        public String toString() {
            int gcd = getGcd(Math.abs(this.fengzi), Math.abs(this.fengmu));
            this.fengzi /= gcd;
            this.fengmu /= gcd;
            if(this.fengzi<0 && this.fengmu<0){
                this.fengzi = -this.fengzi;
                this.fengmu = -this.fengmu;
            }
            if (this.fengzi == this.fengmu) {
                return "1";
            } else {
                return fengzi + "/" + fengmu;
            }
        }

        /**
         * 求两数最大公因数
         * @param a
         * @param b
         * @return
         */
        int getGcd(int a, int b) {
            return b == 0 ? a:getGcd(b,a % b);
        }
    }
}
