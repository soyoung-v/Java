package ch04.sec03;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        // 스위치 표현식 결과 값을 리턴해야할 때 좋다.
        // 스위치 표현식 default 필수
        int num = (int)(Math.random() * 13.0 ) + 1;
        System.out.println("num: " + num);
        String denomination = switch(num) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
        /* 스위치 표현식에서 식을 쓰고 싶으면 아래와 같이 작성하면 된다.
        case 00 -> {
            int a = 10;
            int b = 20;
            yield "Q"; // { yield "J"; }가 이미 생략되지만 여기에선 값 리턴하고 싶을 때 yield 키워드를 꼭 적어야 한다.
        }
        */
            case 13 -> "K";
            default -> String.valueOf(num); // 정수를 문자열로 변경
        };
        System.out.println("denomination: " + denomination);
    }
}
