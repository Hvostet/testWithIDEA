package test1;

import java.util.*;
import java.util.stream.Collectors;

public class asd {  // Нужны гетеры, сетеры to String

    // Сгрупировать по курсу, разделить по возрасту

    public static void main(String[] args) {
        List<Person> map1 = new ArrayList<>();
        map1.add(new Person("Alesha", 52, 1));
        map1.add(new Person("Elena", 48, 2));
        map1.add(new Person("Nikolai", 89, 3));
        map1.add(new Person("Mihail", 89, 3));
        map1.add(new Person("Sveta", 17, 5));
        map1.add(new Person("Anya", 19, 5));

        System.out.println(map1);
        Map<Integer,List<Person>>map2=map1.stream()
                .collect(Collectors.groupingBy(el->el.getCorse()));           // сгрупировать по Corse
        for (Map.Entry<Integer, List<Person>> entry: map2.entrySet()){
            System.out.println(entry.getKey() + ": "+ entry.getValue().toString());
        }

        Map<Boolean,List<Person>> map3= map1.stream().collect(Collectors.partitioningBy(el->el.getAge()>50)); // разделить по возрасту
        for (Map.Entry<Boolean,List<Person>> entry:map3.entrySet()){
            System.out.println(entry.getKey()+ ":"+ entry.getValue().toString());
        }
    }
        static class Person {
            private String name;
            private int age;

            private int corse;

            public Person(String name, int age, int corse) {
                this.name = name;
                this.age = age;
                this.corse = corse;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", corse=" + corse +
                        '}';
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

            public int getCorse() {
                return corse;
            }

            public void setCorse(int corse) {
                this.corse = corse;
            }
        }


    }
