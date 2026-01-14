package ch04.sec02;

public class PrintStar {
    public static void main(String[] args){
        int star = (int)(Math.random() * 4.0) + 3;
        System.out.println(star);

        for(int i=1; i<=star; i++){
            for(int y=1; y<=i; y++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
