import java.util.Vector;

/**
 * @author lyq
 * @time 2023/12/17 20:44
 */
public class MainTest {
    public static void main(String[] args) {
        Vector<Instrument> instruments = new Vector<>();
        instruments.add(new Piano());
        instruments.add(new Violin());
        for (Instrument i :
                instruments) {
            i.play();
        }
    }
}
abstract class Instrument {
    public void play(){
        System.out.println("Instrument...");
    }
}

class Piano extends Instrument{
    @Override
    public void play() {
        System.out.println("Piano....");
    }
}

class Violin extends Instrument{
    @Override
    public void play() {
        System.out.println("Violin...");
    }
}
