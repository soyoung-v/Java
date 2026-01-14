package ch04.sec02;

public class IfElseifElseExample2 {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 81.0) + 20;
        System.out.println(score);
        if (score < 70) {
            System.out.println("D등급");
        } else if (score < 80) {
            System.out.println("C등급");
        } else if (score < 90) {
            System.out.println("B등급");
        } else {
            System.out.println("A등급");
        }
    }
}