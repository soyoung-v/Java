package ch05.sec03;

public class StringMethod2 {
    public static void main(String[] args){
        String oldStr = "abcdefghijklmnophqrstu";
        String newStr1 = oldStr.substring(10); //10번 인덱스 ~ 끝까지 잘라옴
        String newStr2 = oldStr.substring(10,15); //10번 인덱스 ~ 14번 인덱스 까지의 문자열을 잘라옴

        System.out.println("oldStr: " + oldStr);
        System.out.println("newStr1: " + newStr1);
        System.out.println("newStr2: " + newStr2);

        String ssn = "880815-1234567";
        String firstNum = ssn.substring(0,6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);

        //문자열 안에서 문자열 찾기
        //찾으면 첫번째 문자의 인덱스값을 리턴, 없으면 -1을 리턴함
        int idx = oldStr.indexOf("h"); //앞에서 가까운거
        int idx2 = oldStr.lastIndexOf("h"); //뒤에서 가까운거
        System.out.println(idx);
        System.out.println(idx2);
        // 문자열이 포함되어 있는지 찾을 때 , contains도 사용가능
        if(ssn.contains("88")){
            System.out.println("ssn에 88이 있음");
        } else { System.out.println("ssn에 88이 없음");}

        String board = " 번호, 제목, 내용, 성명";
        String[] arr = board.split(",");
        for(int i=0; i<arr.length;i++){
            System.out.printf("arr[%d]: %s\n", i, arr[i]);
        }

    }
}
