/**
 * @author lyq
 * @time 2023/12/9 11:41
 */
public class Company {
    private String name;
    private String address;

    /**
     * 适当的构造方法
     */
    public Company() {
    }

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * 可以修改公司地址
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 重写toString()方法
     * @return
     */
    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
