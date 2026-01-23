package ch04.sec03;

public class SwitchExpressionExample2 {
    public static void main(String[] args) {
        String grade = "VIP"; //VIP, GOLD, NORMAL
        /* vip는 가격에 10% 할인 가격
           gold는 가격에 5% 할인 가격
           normal 는 원래가격
         */
        int price = 10_000;
        int buyPrice = switch (grade){
            case "VIP" -> {
                int buy = (int)(price * 0.1) ;
                yield buy;
            }
            case "GOLD" -> {
                int buy = (int)(price * 0.05) ;
                yield buy;
            }
            default -> 0;
        };
        System.out.println("buyPrice: " + buyPrice);
    }
}
