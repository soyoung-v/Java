package ch02.sec01;

public class OverValue {
    public static void main(String[] args){
        //byte타임은 -128 ~ 127 까지만 저장 가능함.
        byte b1 = -128;
        //byte b2 = -129;
        System.out.println("b1: "+ b1);
        //System.out.println("b2: "+ b2);

        byte b3 = 127;
        //byte b4 = 128;
        System.out.println("b3: "+ b3);
        //System.out.println("b4: "+ b4);

        long l1 = 100_000_000_000_000l ;
        System.out.println("l1: "+ l1);

        //double 8byte, float 4byte
        double d1 = 10.1;

        // float f1 = 10.1;  더 큰쪽에서 작은 쪽으로 데이터를 옮길 때는 자동형변환 X
        float f2 = 10.1f; //리터럴에 f를 붙이면 float타입이 된다.
        double d2 = f2; // 큰쪽 > 작은쪽 자동형변환O

        long l2 = 100_000_000_000_000l;
        //float, double은 지수계산으로 저장하기 때문에 아주 큰 값도 저장가능. 하지만 정확도는 조금 떨어짐
        float f3 = l2;
        // byte < short, char < int < long < float < double

        long l4 = 10l;
        int i1 = (int)l4 ; // 강제 형변환

        System.out.println("l4: "+ l4);
        System.out.println("i1: "+ i1);


    }
}
