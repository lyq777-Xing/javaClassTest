import java.util.Vector;

public class MainTest {
    public static void main(String[] args) {
        Vector<Instrument> instruments = new Vector<>();
        instruments.add(new Piano());
        instruments.add(new Violin());
        for (Instrument i :
                instruments) {
            i.play();
        }

        Person person = new Person("lyq", "浙大宁波理工学院", "18888888888", "158755555@qq.com");
        Vector<Person> people = new Vector<>();
            people.add(new Employee());
    }
}
