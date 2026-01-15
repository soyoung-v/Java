package ch04.sec02;

import java.util.Scanner;

//public class SumProgram {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//
//        while(true){
//            System.out.println("숫자를 입력해 주세요 (종료: 0)");
//            String choice = scanner.nextLine();
//            if(choice.equals("0")){ break;}
//            else {
//                int num = Integer.parseInt(choice);
//                sum = sum + num;}
//        }
//        System.out.println("합계:" + sum);
//
//    }
//}

public class SumProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while(true){
            System.out.println("숫자를 입력해 주세요 (종료: 0)");
            int num = Integer.parseInt(scanner.nextLine());
            if(num==0){ break;}
            else {
                sum = sum + num;}
        }
        System.out.println("합계:" + sum);

    }
}


