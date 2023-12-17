package Z05.seven;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author lyq
 * @time 2023/12/15 21:03
 */
public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        while (sc.hasNext()){
            String s = sc.next();
            if (s.equals("s")){
                String name = sc.next();
                int age = sc.nextInt();
                boolean gender = sc.nextBoolean();
                String stuNo = sc.next();
                String clazz = sc.next();
                if(name.equals("null") || stuNo.equals("null") || clazz.equals("null")){

                }
//                Student student = new Student();
//                people.add(student);
            } else if (s.equals("e")) {
                Employee employee = new Employee(sc.next(), sc.nextInt(), sc.nextBoolean(),sc.nextDouble(), new Company(sc.next()));
                people.add(employee);
            }else {
                break;
            }
        }

    }

}
abstract class Person{
    private String name;
    private int age;
    private boolean gender;

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + "-" + age + "-" + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && gender == person.gender && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}

class Student extends Person{
    private String stuNol;
    private String clazz;

    public Student(String name, int age, boolean gender, String stuNol, String clazz) {
        super(name, age, gender);
        this.stuNol = stuNol;
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return super.toString() + "-" + stuNol + "-" + clazz;
    }

    @Override
    public boolean equals(Object o) {
        if(super.equals(o)){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Student student = (Student) o;
            return Objects.equals(stuNol, student.stuNol) && Objects.equals(clazz, student.clazz);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stuNol, clazz);
    }
}

class Company{
    private String name;

    public Company(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Employee extends Person{
    private Company company;
    private double salary;

    public Employee(String name, int age, boolean gender, double salary, Company company) {
        super(name, age, gender);
        this.company = company;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "-" + company + "-" + salary;
    }

    @Override
    public boolean equals(Object o) {
        if(super.equals(o)){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Employee employee = (Employee) o;
            DecimalFormat df = new DecimalFormat("#.#");
            if(company != null && employee.company == null){
                return false;
            }
            return Double.compare(Double.parseDouble(df.format(employee.salary)), Double.parseDouble(df.format(salary))) == 0 && Objects.equals(company, employee.company);

        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), company, salary);
    }
}
