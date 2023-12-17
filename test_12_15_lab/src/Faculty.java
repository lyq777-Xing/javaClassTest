import java.util.Date;

/**
 * 雇员
 */
public class Faculty extends Employee{
    private String officeDate;
    private int level;

    public Faculty() {
    }

    public Faculty(String officeDate, int level) {
        this.officeDate = officeDate;
        this.level = level;
    }

    public Faculty(String office, double money, MyDate date, String officeDate, int level) {
        super(office, money, date);
        this.officeDate = officeDate;
        this.level = level;
    }

    public String getOfficeDate() {
        return officeDate;
    }

    public void setOfficeDate(String officeDate) {
        this.officeDate = officeDate;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "officeDate='" + officeDate + '\'' +
                ", level=" + level +
                super.toString() +
                '}';
    }
}
