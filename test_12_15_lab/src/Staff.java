/**
 * 职员
 */
public class Staff extends Employee{
   private String staffName;

    public Staff() {
    }

    public Staff(String staffName) {
        this.staffName = staffName;
    }

    public Staff(String office, double money, MyDate date, String staffName) {
        super(office, money, date);
        this.staffName = staffName;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffName='" + staffName + '\'' +
                super.toString() +
                '}';
    }
}
