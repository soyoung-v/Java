package ch06.sec09;

public class Truck {
    //static은 객체 생상과는 무관. 공간이 무조건 하나임
    //객체 생성을 하지 않아도 사용할 수 있다.
    static String company;
    String model;

    void introduce() {
        System.out.printf("company: %s, model: %s\n",company,model);
    }

    static void run(){
        //스테틱이 아닌 애들을 같이 사용하려면 무조건 객체생성을 해줘야함
        Truck t = new Truck();
        t.model = "15톤";
        System.out.printf("%s 회사의 차량이 달린다.\n",company,t.model);
    }
}
