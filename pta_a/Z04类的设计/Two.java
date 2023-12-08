package Z04类的设计;

import java.util.Scanner;

/**
 * @author lyq
 * @time 2023/12/7 23:27
 */
public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextBoolean());
        System.out.println(student.toString());
    }
    static class Student{
        private String name;
        private String gender;
        private int score;
        private boolean award;

        public Student() {
        }

        public Student(String name, String gender, int score, boolean award) {
            this.name = name;
            this.gender = gender;
            this.score = score;
            this.award = award;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public boolean isAward() {
            return award;
        }

        public void setAward(boolean award) {
            this.award = award;
        }

        @Override
        public String toString() {
            return "Student [" +
                    "name=" + name +
                    ", gender=" + gender +
                    ", score=" + score +
                    ", award=" + award +
                    ']';
        }
    }
}
