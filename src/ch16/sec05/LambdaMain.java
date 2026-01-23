package ch16.sec05;

import ch13.sec01.Product;

import java.util.function.*;

public class LambdaMain {
    /* 내장형 함수 인터페이스
    consumer - 소비자, 파라미터는 있는데 리턴이 없다(void), 메소드명 accept
    supplier - 공급자, 파라미터는 없고 리턴만 있다. 메소드명 get
    function - 파리미터도 있고, 리턴도 있다. 메소드명 apply
    Predicate - 파라미터 있고, 리턴은 boolean. 메소드명 test
     */
    public static void main(String[] args){
        //consumer <제네릭>은 파라미터의 타입니다.
        Consumer<Integer> c = (val) -> System.out.println(val + val);
        c.accept(10);
        Consumer<String> c2 = (val) -> System.out.println(val + val);
        c2.accept("하하");

        //supplier <제네릭>은 리턴 타입니다.
        Supplier<String> s = () -> new String("반가워");
        String r1 = s.get();
        System.out.println("r1: "+ r1);

        //function <1, 2>1은 파라미터의 타입, 2는 리턴의 타입.
        Function<Integer, Double> f = val -> Math.random() * val;
        double r2 = f.apply(10);
        System.out.println(r2);

        //BiFunction<1, 2, 3> 1이 첫번째 파라미터, 2는 두번째 파라미터, 3은 리턴의 타입.
        BiFunction<Integer, Integer, Integer> f2 = (sNum, eNum) ->
                (int)(Math.random() * (eNum -sNum)) + sNum;
        int r3 = f2.apply(2,5);
        System.out.println("r3: " + r3);

        //Predicate
        Predicate<String> p = str -> "hello".equalsIgnoreCase(str);
        System.out.println("p: "+ p.test("Hello"));
    }
}
