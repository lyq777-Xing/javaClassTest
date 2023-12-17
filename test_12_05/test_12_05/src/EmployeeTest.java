import java.util.ArrayList;

/**
 * @author lyq
 * @time 2023/12/17 20:46
 */
public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee engineer = new Engineer("N0001", "engineer...",1);
        Employee scientists = new Scientists("N0001", "scientists...", "科学");
        employees.add(engineer);
        employees.add(scientists);
        System.out.println(employees);
        System.out.println(engineer);
        System.out.println(scientists);
    }
}
class Employee{
    private String id;
    private String work;

    public Employee() {
    }

    public Employee(String id, String work) {
        this.id = id;
        this.work = work;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", work='" + work + '\'' +
                '}';
    }
}

class Engineer extends Employee{
    private int level;

    public Engineer() {
    }

    public Engineer(String id, String work, int level) {
        super(id, work);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "level=" + level +
                super.toString() +
                '}';
    }
}

class Scientists extends Employee{
    private String field;

    public Scientists() {
    }

    public Scientists(String id, String work, String field) {
        super(id, work);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Scientists{" +
                "field='" + field + '\'' +
                super.toString() +
                '}';
    }
}