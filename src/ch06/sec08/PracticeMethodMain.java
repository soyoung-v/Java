package ch06.sec08;

public class PracticeMethodMain {
    public static void main(String[] args){
        PracticeMethod pm = new PracticeMethod();
//        pm.abs(10);
//        pm.abs(-10);
//        pm.abs(-8);
        int r1 = pm.random(10);
        System.out.println(r1);

        int r3 = pm.random(2,10);
        int r4 = pm.random(10,15);

        System.out.println(r3);
        System.out.println(r4);

        String grade = pm.getGrade(100);
        System.out.println(grade);

        pm.getGrade2(90);

        pm.printStar(5);
        pm.printStar(3);
        System.out.println("-------");
        pm.printStarTriangle(4);
        System.out.println("-------");
        pm.printStarRectengle(4);

//        pm.gugudan(5);
//        pm.gugudan(3,6);

        int sum = pm.sum(10, 50);
        System.out.println(sum);
    }

}
