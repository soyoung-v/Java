package ch04.sec02;

import java.util.Scanner;

public class KeyContrloExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int speed = 0;

        while (true){
            System.out.println("-----------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-----------------");
            System.out.println("선택: ");
            String choice = scanner.nextLine();
            if(choice.equals("1")){ speed++;}
            else if(choice.equals("2")){ speed--;}
            else if(choice.equals("3")){ break;}
            System.out.println("speed:" + speed);
        }
        System.out.println("--끝--");
    }
}
