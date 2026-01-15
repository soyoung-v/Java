package ch05.sec05;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] arr = { 10, 8, 88, 1, 100, 14 } ;
        int min = arr[0];
        int max = arr[0];

        for(int i =1 ; i < arr.length; i++){
            if(min < arr[i]) { min = arr[i];}
            if(max > arr[i]) { max = arr[i];}
        }
        System.out.printf("max : %d, min: %d",min,max);
    }
}
