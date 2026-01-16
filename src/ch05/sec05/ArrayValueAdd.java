package ch05.sec05;

import java.util.Arrays;

public class ArrayValueAdd {
    public static void main(String[] args){
        int[] arr = { 2, 4, 8, 10 };

        int[] arr2 = new int[arr.length+1];
        arr2[arr.length] = 22;
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
