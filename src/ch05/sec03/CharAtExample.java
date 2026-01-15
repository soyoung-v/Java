package ch05.sec03;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "950624-1230123";

        char gender = ssn.charAt(7);

        if( gender == '1' || gender == '3' ){
            System.out.println("남자");
        }
        else if ( gender == '2' || gender == '4' ){
            System.out.println("여자");
        }

    }
}
