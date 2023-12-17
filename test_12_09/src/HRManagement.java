import java.util.ArrayList;

/**
 * @author lyq
 * @time 2023/12/9 11:57
 */
public class HRManagement {
    ArrayList<Employee> employees = new ArrayList<>();

    /**
     * 输出所有员工的详细信息
     * @return
     */
    @Override
    public String toString() {
        return "HRManagement{" +
                "employees=" + employees +
                '}';
    }

    /**
     * 从员工库中添加员工
     * @param employee
     */
    public void add(Employee employee){
        employees.add(employee);
    }

    /**
     * 从员工库中删除员工
     * @param employee
     */
    public void remove(Employee employee){
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getCode().equals(employee.getCode())){
                employees.remove(i);
            }
        }
    }

    /**
     * 根据姓名查找员工，并打印出查到的结果信息
     * @param name
     * @return
     */
    public Employee query(String name){
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getName().equals(name)){
                return employees.get(i);
            }
        }
        return null;
    }
}
