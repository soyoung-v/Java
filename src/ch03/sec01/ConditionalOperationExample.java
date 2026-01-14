package ch03.sec01;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 91.0) + 10;
        System.out.println(score);

        String result = score > 90 ? "A" : score > 80 ? "B" : "c" ;
        System.out.println(result);
    }


}
