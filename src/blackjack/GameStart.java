package blackjack;

public class GameStart {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        for (int i = 0; i < 2; i++) {
            gamer.receiveCard(cd.draw());
            dealer.receiveCard(cd.draw());
        }
        if (dealer.needMoreCard()) {
            dealer.receiveCard(cd.draw());
        }
        dealer.showYourCards();
//        System.out.println("--딜러--");
//        for(Card c : dealer.openCard()){
//            System.out.println(c);
//        }
        gamer.showYourCards();
//        System.out.println("--게이머--");
//        for(Card c : gamer.openCard()){
//            System.out.println(c);
//        }
        Rule.whoIsWinner(dealer,gamer);

    }
}
