package ch02.sec01;

public class UsingPrintf {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 22;
        double height = 176.5;
        char bloodType = 'A';
        boolean isMAn = true;

        //printf는 JS의 '${변수명}' 이러한 기능을 쓰는 것.
        // 즉 문자열 사이에 변수의 값을 삽입하는 방법.

        System.out.println(name + "의 나이는 " + age + "세이며, 키는 " + height + "cm이고 혈액형은 "
                            + bloodType + "형이고 성별은 남자인가? " + isMAn);
        System.out.printf("%s의 나이는 %d세이며, 키는 %.1fcm이고 혈액형은 %c형이고 성별은 남자인가? %b\n"
                            , name,age,height,bloodType,isMAn);

        System.out.printf("가격: %d\n", 1_000_000);
        System.out.printf("가격: %,d\n", 1000000);

        String result = String.format("가격: %,d\n", 1000000);
        System.out.println(result);

        int mon = 5;
        int day = 13;
        //월, 일을 합쳐서 항상 4자리로 만들고 싶을 때, 00-00, 월도 2자리, 일도 2자리
        System.out.printf("%02d-%02d", mon, day);

    }
}
