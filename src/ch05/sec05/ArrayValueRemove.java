package ch05.sec05;

import java.util.Arrays;

public class ArrayValueRemove {
    public static void main(String[] args){
        int[] arr = { 2, 4, 8, 10, 12, 13 };

        int[] arr2 = new int[arr.length -1];
        for( int i=0; i < arr2.length; i++){
            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
