package Z05.seven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author lyq
 * @time 2023/12/17 18:04
 */
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        ArrayList<PersonOverride> person1 = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            PersonOverride override = new PersonOverride();
            person1.add(override);
        }
        int n2 = sc.nextInt();
        ArrayList<PersonOverride> person2 = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            PersonOverride personOverride = new PersonOverride(sc.next(), sc.nextInt(), sc.nextBoolean());
            int f = 0;
            for (PersonOverride p:
                 person2) {
                if(p.equals(personOverride)){
                    f = 1;
                    break;
                }
            }
            if(f == 0){
                person2.add(personOverride);
            }
        }
        for (PersonOverride p :
                person1) {
            System.out.println(p.toString());
        }
        for (PersonOverride p :
                person2) {
            System.out.println(p.toString());
        }
        System.out.println(person2.size());
        System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));
    }
}
class PersonOverride{
    private String name;
    private int age;
    private boolean gender;

    public PersonOverride() {
        this("default", 1,true);
    }

    public PersonOverride(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + "-" + age + "-" + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonOverride that = (PersonOverride) o;
        return age == that.age && gender == that.gender && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}
