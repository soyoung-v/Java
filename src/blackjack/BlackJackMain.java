package blackjack;

import java.util.Arrays;

public class BlackJackMain {
    public static void main(String[] args){
//        System.out.println("-----최초------");
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.needMoreCard();


//        Card c1 = cd.draw();
//        gamer.receiveCard(c1);
//        Card c2 = cd.draw();
//        gamer.receiveCard(c2);
//        Card c3 = cd.draw();
//        gamer.receiveCard(c3);
        System.out.println("-----게이머 카드------");
        Card[] gamerCards = gamer.openCard();
        System.out.println(Arrays.toString(gamerCards));
        System.out.println("-----딜러 카드------");
        Card[] dealerCards = dealer.openCard();
        System.out.println(Arrays.toString(dealerCards));
//        Card c2 = cd.draw();
//        Card c3 = cd.draw();
//        cd.print();
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);

        Rule.whoIsWinner(dealer, gamer);

    }
}
