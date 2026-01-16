package ch05.sec06;
import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        System.out.println("args[0]: " + args[0]);
        final int COUNT = args.length == 1 ? Integer.parseInt(args[0]) : 3; //자바에서 상수 만드는 방법(final 붙이면 된다.)
        Scanner scanner = new Scanner(System.in);

        // 맞춰야되는 숫자들
        int[] questions = new int[COUNT];
        for (int i = 0; i < COUNT; i++) {
            questions[i] = (int) (Math.random() * 9) + 1;
            for (int x = 0; x < i; x++) {
                if (questions[x] == questions[i]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(questions));
        //questions에 중복되지 않는 숫자(1~9)를 배열의 길이만큼 채워야 한다.
        int tryCount = 0;
        while (true) {
            System.out.print("answer >>");
            String answer = scanner.nextLine();
            System.out.println(answer);

            String[] strAnswers = answer.split(" ");
            int[] answers = new int[strAnswers.length];
            for (int i = 0; i < strAnswers.length; i++) {
                answers[i] = Integer.parseInt(strAnswers[i]);
            }
            System.out.println(Arrays.toString(answers));

            int ball = 0;
            int strike = 0;
            for (int x = 0; x < COUNT; x++) {
                for (int y = 0; y < COUNT; y++) {
                    if (questions[x] == answers[y]) {
                        if (x == y) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }

            }
            tryCount++;
            System.out.printf("ball: %d, Strike: %d, out: %d\n", ball, strike, COUNT-(ball+strike));
            if(strike==COUNT){break;}

        }
        System.out.println("--끝 - 시도횟수: " + tryCount + "--");
    }
}
