package ch04.sec02;

public class IfExample {
    public static void main(String[] args){
        int num = -10;
        int result = num;
        if(num<0){
            result = num * -1;
        }
        //int result = num < 0 ? num * -1 : num ;
        System.out.println(result);
    }
}
