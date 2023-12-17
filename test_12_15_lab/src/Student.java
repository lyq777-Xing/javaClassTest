public class Student extends Person{
    private String status;

    public Student() {
    }

    public Student(String status) {
        this.status = status;
    }

    public Student(String name, String address, String phone, String email, String status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
