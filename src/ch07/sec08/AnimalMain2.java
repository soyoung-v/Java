package ch07.sec08;

public class AnimalMain2 {
    /*대전제 3 deep
    메소드 호출은 타입이 알고 있는 메소드만 호출할 수 있고,
    호출이되면 객체 기준에서 메소드를 찾는다.
    Dog클래스에 새로운 메소드 jump()추가
     */
    public static void main(String[] args){
        Animal animal = new Bulldog(); //Dog객체는 jump메소드를 갖고있다
        animal.crying();//animal 입장에서는 알고 있는 메소드
        //animal.jump();// animal 입장에서는 모르는 메소드

        if(animal instanceof  Dog) {
            Dog dog = (Dog) animal;
            dog.jump();
        }

        //변수에 담겨져 있는 객체를 타입에 담을 수 있으면 true
        //없으면 false 리턴 . 왼쪽 변수 우측이 타입

        System.out.println(animal instanceof Dog);

    }
}
