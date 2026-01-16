package ch06.sec03;

public class CarMain {
    public static void main(String[] args){
        Car cl = new Car("그랜저", "검정", 300);
        cl.introduceMySelf();

        Car c2 = new Car("k8");
        c2.introduceMySelf();

        Car c3 = new Car();
        c3.introduceMySelf();

        Car c4 = new Car("K5",220);
        c4.introduceMySelf();
    }
}
