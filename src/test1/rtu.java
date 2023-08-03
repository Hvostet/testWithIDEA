package test1;

import java.util.*;

public class rtu {
    public static void main(String[] args) {


       int [] mas = new int []{1,3,4,5,7,89,45,67,20,21,15};

      String[] list= Arrays.stream(mas).mapToObj(el-> {
          if (el % 3 == 0 && el % 5 == 0) {
              return "FizBiz";
          } else if (el % 3 == 0) {
              return "Fizz";
          } else if (el % 5 == 0) {
              return "Biz";
          } else{
              return String.valueOf(el);
      }
    }).toArray(String[]::new);

        for (String i:list){
            System.out.print(i+" ");
        }

        System.out.println(); // если нужно передать в лист
        List<String> list2=Arrays.asList(list);
        System.out.println(list2);


    }
}
