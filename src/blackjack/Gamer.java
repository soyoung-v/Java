package blackjack;

public class Gamer {
    //게이머는 카드 객체 주소값 52개를 저장할 수 있다.
    private Card[] cards = new Card[52];
    private int idx = 0;
    protected String name;

    public Gamer(){
        this("게이머");
    }

    protected Gamer(String name){
        this.name = name;
    }
    //받은카드 넣기
    public void receiveCard(Card card){
        cards[idx++] = card;
    }

    //받은카드 전달
    public Card[] openCard(){
//        int idx = 0;
//        for(int i=0; i<cards.length; i++){
//            if(cards[i]== null){
//                idx = i;
//                break;
//            }
//        } 위에 인덱스 쓰면됨...
        Card[] temp = new Card[idx];
        for(int i=0; i<idx; i++){
            temp[i]=cards[i];
        }
        return temp;
    }

    public void showYourCards(){
        System.out.printf("--%s--\n",this.name);
        for(Card c : this.openCard()){
            System.out.println(c);
        }
    }
}
