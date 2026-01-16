package ch06.sec08;

import ch06.sec03.Car;

public class CalculatorMain {
   public static void main(String[] args){
       Calculator cal1 = new Calculator();
       cal1.poweroff();
       cal1.powerOn();
       int result = cal1.plus(10,20);
       System.out.println(result);

       double result2 = cal1.divide(10,3);
       System.out.println(result2);
   }
}
