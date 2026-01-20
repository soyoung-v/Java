package blackjack;

public class Card {
    //무늬 pattern (스페이드, 하트, 클로버, 다이아)
    //숫자 denomination (A, 2~10, J, Q, K 중 한 값을 담을 수 있어야한다.)
    private final String pattern;
    private final String denomination ;

    public Card(String pattern, String denomination){
        this.pattern = pattern;
        this.denomination = denomination;
    }
    public String getPattern(){
        return pattern;
    }
    public String getDenomination(){
        return denomination;
    }


}
