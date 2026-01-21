package blackjack;

import java.util.Arrays;

public class Rule {
    private static final int blackScore = 21;

    //받은 카드들의 점수 합산
    public static int calcScore(Card[] cards){
        int totalScore = 0;
        for(Card card : cards) {
            String denomination = card.getDenomination();
            int score = switch (denomination) {
                case "A" -> 1 ;
                case "J", "Q", "K" -> 10;
                default -> Integer.parseInt(denomination);
            };
            totalScore += score;
        }
        return totalScore;
    }

    //딜러와 게이머의 점수 확인
    public static void whoIsWinner(Dealer dealer, Gamer gamer){
        int dealerScore = calcScore(dealer.openCard());
        int gamerScore = calcScore(gamer.openCard());
        System.out.println("딜러 점수: " + dealerScore + ", 게이머 점수: "+ gamerScore);

        if (dealerScore == gamerScore || (dealerScore > blackScore && gamerScore > blackScore)) {
            System.out.println("무승부");
        } else if (dealerScore > blackScore) {
            System.out.println("게이머 승");
        } else if (gamerScore > blackScore) {
            System.out.println("딜러 승");
        } else {
            System.out.println(dealerScore < gamerScore ? "게이머 승" : "딜러 승");
        }
    }

}
