package ch07.sec02;

public class SmartPhoneMain {
    public static void main(String[] args){
       SmartPhone p1 = new SmartPhone("갤럭시","은색");
       p1.toggleWifi();
       p1.toggleWifi();
       p1.toggleWifi();
       p1.toggleWifi();
       //부모영역의 객체들도 쓸 수 있다.
       p1.bell();
       p1.hangUp();
       p1.sendMessage("안녕");

    }
}
