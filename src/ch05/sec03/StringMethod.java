package ch05.sec03;

public class StringMethod {
    public static void main(String[] args){
        String oldStr = "자바 프로그래밍";
        String newStr = oldStr.replace("자바", "Java");

        System.out.println("oldStr: " + oldStr);
        System.out.println("newStr: " + newStr);

        String oldStr2 = "가나다라1마바사2ABCD4";
        // 정규식은 지피티나 제미나이에게 위 코드를 주고 숫자만 삭제 등을 요청해서 쓰는게 좋다.
        // 정규식을 외워서 쓰기는 매우 어렵기 때문..
        String newStr2 = oldStr2.replaceAll("\\d", "");
        String newStr3 = oldStr2.replaceAll("[ㅏ-ㅣㄱ-ㅎ가-힣a-zA-Z]","");
        System.out.println("oldStr2: " + oldStr2);
        System.out.println("newStr2: " + newStr2);
        System.out.println("newStr2: " + newStr3);

        String oldStr4 = "안녕 하 세요. 반가워요. 저는 홍 길동 입니다.";
        String newStr4 = oldStr4.replace(" ","");
        System.out.println("newStr4: " + newStr4);
    }
}
