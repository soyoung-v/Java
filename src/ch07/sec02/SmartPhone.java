package ch07.sec02;

//상속 + 생성자 마무리
//Phone클래스를 상속받고 싶다면 extends 키워드를 준다
public class SmartPhone extends Phone{

    private boolean wifi;//전역변수 boolean타입은 디폴트값이 false

    public SmartPhone(String model, String color){
        super(model,color);
    }

    public void toggleWifi(){
        this.wifi = !this.wifi;
        System.out.println("wifi: "+ wifi);
    }

    /* 메소드 오버라이딩(Overriding)은 부모가 가지고 있는 메소드를
    다시 정의하는 것을 얘기한다. 선언부가 똑같아야 한다.
    @Override 애노테이션을 뭍여준다.(실수 방지용)
     */
    @Override
    public void bell(){

        System.out.println("스마트폰 진동과 벨이 울린다.");
    }
}
