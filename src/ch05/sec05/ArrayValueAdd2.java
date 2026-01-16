package ch05.sec05;

import java.util.Arrays;

public class ArrayValueAdd2 {
    public static void main(String[] args){
        int[] arr = { 2, 4, 8, 10, 11 };
                    //2, 4, 22, 8, 10, 11
        int value = 22;
        int idx = 2;
        int x = 0;

        int[] arr2 = new int[arr.length+1];
        for (int i = 0; i < arr2.length; i++) {
            if (i == idx) {
                arr2[i] = value;
            } else {
                arr2[i] = arr[x];
                x++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
