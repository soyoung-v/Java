package blackjack;

import ch07.sec08.Bulldog;
import ch07.sec08.Dog;

import java.util.Arrays;

public class CardDeck {
    //Card 객체 주소값 52개를 담을 수 있어야 한다.

    private Card[] cards = new Card[52];
    private String[] pat = {"스페이스","하트","클로버","다이아"};
    private String[] den = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    public CardDeck(){
        int count = 0;
        for(int p =0; p < pat.length ; p++){
            for(int d = 0; d< den.length; d++){
                cards[count] = new Card(pat[p],den[d]);
                count++;
            }
        }
        for(Card c : cards){
            System.out.printf("%s - %s\n", c.getPattern(),c.getDenomination());
        }
    }

}
