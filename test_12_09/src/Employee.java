/**
 * @author lyq
 * @time 2023/12/9 11:42
 */
public class Employee {
    private String code;
    private String name;
    private Company company;

    public Employee() {
    }

    public Employee(String code, String name, Company company) {
        this.code = code;
        this.name = name;
        this.company = company;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", company=" + company +
                '}';
    }
}
