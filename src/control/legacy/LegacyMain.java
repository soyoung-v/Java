package control.legacy;

import control.Tv;

public class LegacyMain {
    public static void main(String[] args){
        Tv tv = new SamsungTv();
        tv.sound();
    }
}
