public class Employee extends Person{
    private String office;
    private double money;
    private MyDate date;

    public Employee() {
    }

    public Employee(String office, double money, MyDate date) {
        this.office = office;
        this.money = money;
        this.date = date;
    }

    public Employee(String name, String address, String phone, String email, String office, double money, MyDate date) {
        super(name, address, phone, email);
        this.office = office;
        this.money = money;
        this.date = date;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "office='" + office + '\'' +
                ", money=" + money +
                ", date=" + date +
                super.toString() +
                '}';
    }
}
