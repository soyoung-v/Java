package ch05.sec03;

public class Mission01 {
    public static void main(String[] args){
        String fileNm = "abc12-jjasklfsdajflk-bbb.kkk.zip";
        int idx = fileNm.lastIndexOf(".");
        String file = fileNm.substring((idx+1));

        System.out.println(file);

    }
}
