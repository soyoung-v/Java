package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args){
        Person p1 = new Person();

        Calculable c1 = (double x, double y) -> x+y ;
        p1.action(c1 ,10.0,12.2);
        p1.action((double x, double y) -> x-y,10.0,12.2);
        p1.action((double x, double y) -> x*y,10.0,12.2);
        p1.action((double x, double y) -> x/y,10.0,12.2);
    }
}
