package test2;

// java
// дается массив чисел [0, 5, 0, 0, 3]
// получить массив, где все 0 находятся в конце,
// а остальные числа находятся в прежнем порядке
// [0, 5, 0, 0, 3] -> [5, 3, 0, 0, 0]
// [0, 3, 0, 0, 5] -> [3, 5, 0, 0, 0]

import java.util.Arrays;

public class test9 {
    public static void main(String[] args) {
        int [] arr1=new int[]{0, 5, 0, 0, 3};
        int[] arr2=new int[arr1.length];
        int count=0;
        for (int i=0; i< arr1.length;i++){
            if (arr1[i]!=0){
                arr2[count]=arr1[i];
                count=count+1;
        }

        }System.out.println(Arrays.toString(arr2));
    }
}
