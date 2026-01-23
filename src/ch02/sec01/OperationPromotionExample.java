package ch02.sec01;

public class OperationPromotionExample {
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 3;
        int result = n1/n2; //정수 / 정수 = 정수
        System.out.println("result: "+ result);

        float result1 = (float)n1/n2; //실수 / 실수 = 실수
        System.out.println("result1: "+ result1);

        char c1 = 'A'; // 문자를 숫자로 변환하면 아스키코드값 65가 출력
        System.out.printf("%c - %d\n", c1, (int)c1);

        int i1 = c1 + 2;
        System.out.printf("%c - %d\n", (char)i1, i1);

        String str = "AC";

    }
}
