package ch06.sec09;

public class Car {
    String model;
    int speed;

    public Car(String model){
        this.model = model;
        this.introduce();
    }

    public Car(){
        this("소나타");
    }
    public void introduce(){
        System.out.printf("모델명: %s\n",model);
    }
}
