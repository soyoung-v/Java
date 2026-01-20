package ch07.sec08;
public class AnimalMain {
/* 멤버필드는 어차피 private으로 은닉화 할꺼니 메소드에만 집중!!!

대전제!! 3가지
1. 부모 타입의 변수는 자식 객체 주소값 담을 수 있다.
2. 자식 타입의 변수는 부모 객체 주소값 담을 수 없다.
3. 메소드 호출은 타입이 알고 있는 매소드만 호출할 수 잇고,
   호출이 되면 객체 기준에서 메소드를 찾는다.

 레퍼런스 타입끼리의 형변환은 상속관계에서만 가능하다.
 다형성은 상속관계에서만 나타난다.
 */
    public static void main(String[] args){
        //1. Animal 객체 주소값 담을 수 있는 animal변수 + Animal 자식 객체의 주소값도 가능.
        Animal animal = new Dog();
        //Dog타입의 변수로 BullDog객체 주소값 담을 수 있다.
        Dog dog = new Bulldog();
        dog.crying();

        //2. Dog dog2 = new Animal(); 컴파일 에러
        //   Dog dog2 = (Dog)(new Animal()); 강제 형변혼도 안됨
        Dog dog3 = (Dog)animal; //animal은 자식 객체 주솟값이 들어있어 담을 수 있음

        //3.
        animal.crying();

    }
}
