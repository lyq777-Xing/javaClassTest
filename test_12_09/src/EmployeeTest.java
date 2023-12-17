/**
 * @author lyq
 * @time 2023/12/9 11:44
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setCode("N000001");
        employee.setName("li");
        employee.setCompany(new Company("信计专231","sl"));
        System.out.println("该员工的编号为：" + employee.getCode());
        System.out.println("该员工的名称为：" + employee.getName());
        System.out.println("该员工的所在公司为：" + employee.getCompany());
        System.out.println(employee.toString());
    }
}
