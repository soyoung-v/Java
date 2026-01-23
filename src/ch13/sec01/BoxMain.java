package ch13.sec01;

public class BoxMain {
    public static void main(String[] args) {
        //제네릭은 컴파일이 될 때 타입이 결정된다.
        Box<Integer> boxInt = new Box<>();
        boxInt.setContent(10);
        int r1 = boxInt.getContent();

        Box<String> boxStr = new Box<>();
        boxStr.setContent("10");
        String s1 = boxStr.getContent();
    }
}
