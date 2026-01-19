package ch06.sec08;

public class PracticeMethod {
    public void abs(int x){
        System.out.println(x<0? x * -1: x);
    }
    public int random(int x){
        int num = (int)(Math.random() * x );
        return num;
    }
    public int random(int x, int y){
//        int num1 = (int)(Math.random() * (y-x) ) + x;
        return (int)(Math.random() * (y-x) ) + x;
    }

    public String getGrade(int x) {
        if (x > 90) {
            return "A";
        } else if (x > 80) {
            return "B";
        }
        return "C";
    }
    public void getGrade2(int x){
        if (x > 90) {
            System.out.println("A");
        } else if (x > 80) {
            System.out.println("B");
        }
        else {System.out.println("C");}
    }

    public void printStar(int x){
        for(int i = 0 ; i < x ; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public void printStarTriangle(int x){
        for(int i = 0 ; i <= x ; i++) {
            printStar(i);
        }
    }
    public void printStarRectengle(int x){
        for(int i = 0 ; i < x ; i++){
                printStar(x);
            }
    }
    public void gugudan(int x){
        for(int i = 1 ; i <= 9 ; i++){
            System.out.printf("%d x %d = %d\n",x, i,(x*i));
        }
    }
    public void gugudan(int x, int y){
        for(int num = x ; num <= y ; num++){
            gugudan(num);
        }
    }
    public int sum(int x, int y){
        int sum = 0;
        for(int i = x; i <= y; i++){
            sum += i;
        }
        return sum;
    }
}

