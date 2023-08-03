package test1;

import java.util.ArrayList;
import java.util.List;

public class test5 {


    public static void main(String[] args) {


        Stud stud1 = new Stud("Misa", 48, 5.0f, 4);
        Stud stud2 = new Stud("Masha", 36, 4.9f, 3);
        Stud stud3 = new Stud("Sasha", 33, 3.5f, 2);
        Stud stud4 = new Stud("Alesha", 24, 3.6f, 1);
        Stud stud5 = new Stud("Nasty", 18, 4.9f, 1);
        Stud stud6 = new Stud("Katya", 23, 5.0f, 2);
        Stud stud7 = new Stud("Oleg", 40, 4.5f, 3);
        Stud stud8 = new Stud("Ivan", 52, 5.0f, 5);


        List<Stud> list1 = new ArrayList<>();
        list1.add(stud1);
        list1.add(stud2);
        list1.add(stud3);
        list1.add(stud4);
        list1.add(stud5);
        list1.add(stud6);
        list1.add(stud7);
        list1.add(stud8);

        System.out.println(list1);





    }
}

class Stud  {

    private String name;
    private int age;
    private float ball;
    private int corse;


    public Stud(String name, int age, float ball, int corse) {
        this.name = name;
        this.age = age;
        this.ball = ball;
        this.corse = corse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getBall() {
        return ball;
    }

    public void setBall(float ball) {
        this.ball = ball;
    }

    public int getCorse() {
        return corse;
    }

    public void setCorse(int corse) {
        this.corse = corse;
    }

    @Override
    public String toString() {
        return "test1.Stud{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ball=" + ball +
                ", corse=" + corse +
                '}';
    }



}



