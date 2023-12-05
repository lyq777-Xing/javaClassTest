package assignment.ass03a;

/**
 * @author lyq
 * @time 2023/11/30 18:41
 */
public class Tree {
    private int age;

    public Tree(int age) {
        this.age = age;
    }

    public Tree() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void grow(int year){
        this.age = this.age + year;
    }
    public void printAge(){
        System.out.println("The Tree's Age:" + this.age);
    }
}
