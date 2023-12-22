package Z05.seven;

import java.text.DecimalFormat;
import java.util.*;

import static java.lang.System.exit;

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
                String stuNol = sc.next();
                String clazz = sc.next();
//                if(! (name.equals("null") || stuNol.equals("null") || clazz.equals("null") ) ){
                    Student student = new Student( name,  age,  gender,  stuNol,  clazz);
                    people.add(student);
//                }

            } else if (s.equals("e")) {
//                String name, int age, boolean gender, double salary, Company company
                String name = sc.next();
                int age = sc.nextInt();
                boolean gender = sc.nextBoolean();
                double salary = sc.nextDouble();
                String company = sc.next();
//                if(! (name.equals("null") ) ){
                    Company company1 = new Company(company);
                    Employee employee = new Employee( name,  age,  gender,  salary,  company1);
                    people.add(employee);
//                }
            }else {
                break;
            }
        }
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getName().equals(o2.getName())){
                    if (o1.getAge() == o2.getAge()){
                        return 0;
                    }
                    return o1.getAge() > o2.getAge() ? 1 : -1;
                }else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });

        for (Person p :
                people) {
            System.out.println(p);
        }

        String next = sc.next();
        if(next.equals("exit") || next.equals("return")){
            exit(1);
        }else {
            ArrayList<Student> stuList = new ArrayList<>();
            ArrayList<Employee> empList = new ArrayList<>();
            for (Person p :
                    people) {
                if (p.getClass() == Student.class){
                    int f = 0;
                    for (Student s :
                            stuList) {
                        if(s.equals(p)){
                            f = 1;
                            break;
                        }
                    }
                    if(f == 0){
                        stuList.add((Student) p);
                    }
                }else {
                    int f = 0;
                    for (Employee e :
                            empList) {
                        if (e.equals(p)) {
                            f = 1;
                            break;
                        }
                    }
                    if(f == 0){
                        empList.add((Employee) p);
                    }
                }
            }
            System.out.println("stuList");
            for (Student s :
                    stuList) {
                System.out.println(s);
            }
            System.out.println("empList");
            for (Employee e :
                    empList) {
                System.out.println(e);
            }
        }
    }

}
class Person{
    private String name;
    private int age;
    private boolean gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

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
        return "Student:" + super.toString() + "-" + stuNol + "-" + clazz;
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
        return "Employee:" + super.toString() + "-" + company + "-" + salary;
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
