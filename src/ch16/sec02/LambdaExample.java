package ch16.sec02;

import ch16.sec01.Calculable;

public class LambdaExample {
    public static void main(String[] args){
        Person p = new Person();
        //action을 호출하면서 Workable을 implement한 객체 주솟갑 전달하기
        //1번째 (이름있는) 클래스 이용
        Workable w1 = new Mechanic();
        p.action(w1);

        //2번째 (익명) 클래스 이용
        Workable w2 = new Workable() {
            @Override
            public void work(){
                System.out.println("청소부가 청소를 열심히 한다.");
            }
        };
        p.action(w2);

        //3번째 람다식 이용
        Workable w3 = () -> System.out.println("강사가 청소를 열심히 한다.");
        p.action(w3);
        p.action(() -> System.out.println("강사가 청소를 열심히 한다."));
    }
}
