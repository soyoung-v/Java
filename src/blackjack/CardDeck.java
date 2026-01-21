package blackjack;

import ch07.sec08.Bulldog;
import ch07.sec08.Dog;

import java.util.Arrays;

public class CardDeck {
    //Card 객체 주소값 52개를 담을 수 있어야 한다.

    private Card[] cards = new Card[52];
    private String[] pat = {"스페이스","하트","클로버","다이아"};
    private String[] den = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private int idx= 0;

    public CardDeck(){
        init();
        shuffle();
    }
        //새로운 카드 순서대로 넣기
    private void init(){
        int count = 0;
        for(int p =0; p < pat.length ; p++){
            for(int d = 0; d< den.length; d++){
                cards[count] = new Card(pat[p],den[d]);
                count++;
            }
        }
    }
    //넣은카드 랜덤으로 재배치
    private void shuffle(){
        for(int i=0; i<cards.length;i++){
            int randomIdx = (int)(Math.random() * cards.length);
            Card temp = cards[i];
            cards[i] =  cards[randomIdx];
            cards[randomIdx] = temp;
        }
    }
    //카드를 한장식 주고 준 카드는 null로 바꿈
    public Card draw() {
        if(idx>51){
            return null;}
        Card temp = cards[idx];
        cards[idx++] = null;
        return temp;
    }
    public void print() { //검증용!
        for(int i=0; i<cards.length; i++) {
            Card c = cards[i];
            if(c == null) {
                System.out.println("null");
            } else {
                System.out.printf("%s - %s\n", c.getPattern(), c.getDenomination());
            }
        }
    }
}
