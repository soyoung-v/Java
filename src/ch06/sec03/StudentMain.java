package ch06.sec03;

public class StudentMain {
    public static void main(String[] args) {
        //Student 객체 생성 (객체화)
        //Student s1은 레퍼런스 변수이고
        //객체의 조소값을 담을 수 있다.
        //단!! Student객체의 주소값만 담을 수 있다.

        //Student() >> 기본 생성자
        //기본생성자는 매소드의 한 종류인데 특별한 매소드다
        // 객체 생성때만 호출할 수 있고 생성 이후에는 호출할수 없다.
        //객체 생성할 때는 무조건 생성자를 호출해야 한다.
        //생성자를 정의하지 않으면 컴파일러가 기본생성자는 자동으로 만들어 줌
        Student s1 = new Student(100, "김예림");
        s1.introduceMySelf();
        s1.no = 1;
        s1.name = "권수영";
        s1.introduceMySelf();

        Student s2 = new Student();
        s2.introduceMySelf();
        s2.no = 12;
        s2.name = "임준이";
        s2.introduceMySelf();

    }
}
