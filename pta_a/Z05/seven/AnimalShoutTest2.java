package Z05.seven;

/**
 * @author lyq
 * @time 2023/12/17 17:58
 */
//动物发生模拟器.  请在下面的【】处添加代码。
public class AnimalShoutTest2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Goat goat = new Goat();
        speak(cat);
        speak(dog);
        speak(goat);
    }
    //定义静态方法speak()
    static void speak(Animal animal){
        animal.shout();
    }
}

//定义抽象类Animal
abstract class Animal{
    public String getAnimalClass(){
        return null;
    }
    public void shout(){

    }
}
//基于Animal类，定义猫类Cat，并重写两个抽象方法
class Cat extends Animal{
    @Override
    public String getAnimalClass() {
        return "猫";
    }

    @Override
    public void shout() {
        System.out.println("猫的叫声：喵喵");
    }
}
//基于Animal类，定义狗类Dog，并重写两个抽象方法
class Dog extends Animal{
    @Override
    public String getAnimalClass() {
        return "狗";
    }

    @Override
    public void shout() {
        System.out.println("狗的叫声：汪汪");
    }
}
//基于Animal类，定义山羊类Goat，并重写两个抽象方法
class Goat extends Animal{
    @Override
    public String getAnimalClass() {
        return "山羊";
    }

    @Override
    public void shout() {
        System.out.println("山羊的叫声：咩咩");
    }
}