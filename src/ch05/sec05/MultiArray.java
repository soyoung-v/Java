package ch05.sec05;

public class MultiArray {
    /* 다차원 배열 (2차원 배열)
    배열 안에 배열이 있는 것

    */
    public static void main(String[] args){
        int[][] arr = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 },
                { 100, 110, 120 }
        };
        System.out.println("arr.length: " + arr.length);
        System.out.println("arr[0].length: " + arr[0].length);
        System.out.println("arr[0][0]: " + arr[0][0]);
        System.out.println("arr[2][1]: " + arr[2][1]);
        System.out.println("---------------------");

        for(int x=0;x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.print(arr[x][y]);
                if(y < (arr[x].length -1)) { System.out.print(" ");}
            }
            System.out.println();
        }

        System.out.println("---------------------");

        for(int x=0;x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.println(arr[x][y]);
            }
        }
    }
}
