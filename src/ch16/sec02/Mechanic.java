package ch16.sec02;

public class Mechanic implements Workable{

    @Override
    public void work() {
        System.out.println("정비공이 정비를 한다.");
    }
}
