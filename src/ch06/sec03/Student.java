package ch06.sec03;
/* 객체는 무엇으로 이루어져 있는가?
속성: 멤버필드
메소드: 멤버메소드

생성자 vs 메소드 다른점 2가지
1. 이름은 클래스명과 동일
2. 리턴타입이 없다.
 */
public class Student {
    int no;
    String name;

    public Student(){
        this(0,"홍길동");
        System.out.println("--Student 기본생성자--");
//        no = 0;
//        name = "홍길동";
    }

    public Student(int no, String name){
        System.out.println("--Student 오버로딩 생성자--");
        this.no = no;
        this.name = name;
    }

    void introduceMySelf(){
        System.out.printf("저는 %d번이고 이름은 %s입니다.\n", no, name);
    }
}
