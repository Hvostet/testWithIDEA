package test2;

import java.util.Arrays;

public class test8 {

    public static void main(String[] args) {
        System.out.println("hi");
//     Слить два отсортированных массива

        int[] arr1 = new int[]{1, 2, 3, 5, 6, 8, 9};
        int[] arr2 = new int[]{1, 2, 4, 6, 6, 9};

        int [] arr3= new int[arr1.length+ arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while (i< arr1.length && j< arr2.length){
            if (arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        while (i< arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while (j< arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr3));


    }
}