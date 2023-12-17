/**
 * @author lyq
 * @time 2023/12/9 12:07
 */
public class HRManagementTest {
    public static void main(String[] args) {
        HRManagement hrManagement = new HRManagement();
        Employee employee = new Employee("N0001","li",new Company("N000","sl"));
        hrManagement.add(employee);
        hrManagement.add(new Employee("N0002","wang",new Company("N001","NB")));
        System.out.println(hrManagement);
        hrManagement.remove(employee);
        System.out.println(hrManagement);
        Employee wang = hrManagement.query("wang");
        System.out.println(wang);
    }
}
