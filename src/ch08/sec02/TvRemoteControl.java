package ch08.sec02;
//인터페이스를 상속받을 땐 implements 키워드를 사용한다.
//그리고 인터페이스를 상속받는다고 표현하지 않고 구현한다라고 표현함.
public class TvRemoteControl implements RemoteControl{
    private int volume = MIN_VOLUME;
    private boolean mute = false;
    @Override
    public void turnOn() {
        System.out.println("tv를 켠다");
    }

    @Override
    public void volumeUp() {
        if(volume<MAX_VOLUME){
        System.out.printf("volume: %d\n",++volume);}
        else{System.out.printf("volume: %d\n",volume);}
    }

    @Override
    public void volumeDown() {
        if(volume>MIN_VOLUME){
            System.out.printf("volume: %d\n",--volume);}
        else{System.out.printf("volume: %d\n",volume);}
    }

    @Override
    public void mute() {
        mute = !mute;
        if(mute){
            System.out.printf("(음소거) volume: %d\n",MIN_VOLUME);}
        else{
            System.out.printf("volume: %d\n",volume);}
    }

    public void turnOff(){
        System.out.println("tv를 끄다.");
    }
}

