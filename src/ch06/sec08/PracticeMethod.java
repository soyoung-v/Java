package ch06.sec08;

public class PracticeMethod {
    public void abs(int x){
        System.out.println(x<0? x * -1: x);
    }
    public int random(int x){
        int num = (int)(Math.random() * x );
        return num;
    }
    public int random(int x, int y){
//        int num1 = (int)(Math.random() * (y-x) ) + x;
        return (int)(Math.random() * (y-x) ) + x;
    }
}
