package ch05.sec03;

public class RefVariableCompareExample {
    public static void main(String[] args){
        //자바에서 배열 만드는 방법 중 하나
        //자바에서도 배열은 객체이다.
        //진리!!  primitive 변수를 제외한 모든 것들은 참조변수
        int a; //(primitive) 일반 변수

        // 아래는 모드 레퍼런스 타입이라고 부른다.
        int b[];
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        int[] arr3 = arr1; //주소값 복사!!

        //레퍼런스 타입 끼리의 == 비교는 주소값 비교
        System.out.println(arr1 == arr2);
        System.out.println(arr1 == arr3);

    }
}
