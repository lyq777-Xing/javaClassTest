//package Z05.seven;
//
//import java.util.Scanner;
//
///**
// * @author lyq
// * @time 2023/12/15 20:37
// */
//public class People {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Student student = new Student(sc.next(), sc.nextInt());
//        Undergraduate undergraduate = new Undergraduate(sc.next(), sc.nextInt(), sc.next());
//        System.out.println(student.show());
//        System.out.println(undergraduate.show());
//    }
//}
//class Student{
//    protected String name;
//    protected int age;
//
//    public Student() {
//    }
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    public String show(){
//        return "Student[" +
//                "name=" + name +
//                ",age=" + age +
//                ']';
//    }
//}
//class Undergraduate extends Student{
//    private String major;
//
//    public Undergraduate(String name, int age, String major) {
//        super(name, age);
//        this.major = major;
//    }
//
//    public String show() {
//        return "Undergraduate[" +
//                "name=" + name +
//                ",age=" + age +
//                ",major=" + major +
//                ']';
//    }
//}