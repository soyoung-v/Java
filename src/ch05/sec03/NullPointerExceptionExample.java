package ch05.sec03;

public class NullPointerExceptionExample {
    public static void main(String[] args){
        int[] arr = null; //null은 주소값이 없다는 의미
        //int len =arr.length; --> NPE발생
        // 가리키는 객체가 없는데 읽기 혹은 호출을 하면 에외가 발생한다.

        String input = "3";
                //input = null;
//        if(input.equals("3")){
//            System.out.println("정지");
//        }
        // 인풋의 값이 null이 되면 NPE가 발생한다
        // 그래서 이퀄스함수로 호출할때는 위치를 바꿔주면 널이 되어도 작동을 한다
        if("3".equals(input)) {
            System.out.println("정지");
        }
        System.out.println("끝");
    }

}
