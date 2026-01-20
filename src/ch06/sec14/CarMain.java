package ch06.sec14;

public class CarMain {
    public static void main(String[] args){
        Car c1 = new Car("그랜저",170);
        c1.setModel("소나타");

        String model = c1.getModel();
        int speed = c1.getSpeed();
        System.out.println(model+speed);
    }
}
