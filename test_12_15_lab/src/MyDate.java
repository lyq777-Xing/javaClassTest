import java.util.Date;

public class MyDate {
    private String date;

    public MyDate(String date) {
        this.date = date;
    }

    public MyDate() {
        this.date = "2002-07-25";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "date='" + date + '\'' +
                '}';
    }
}
