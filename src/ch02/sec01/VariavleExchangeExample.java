package ch02.sec01;

public class VariavleExchangeExample {
    public static void main(String[] args) {
        int x = 3 ;
        int y = 5 ;

        int i = x;
        x = y ;
        y = i ;

        System.out.println("x: " + x + ", y: " + y);
        System.out.printf("x: %c, y: %d\n", "x", y);

    }
}
