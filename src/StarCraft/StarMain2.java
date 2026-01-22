package StarCraft;

public class StarMain2 {
    public static void main(String[] args){
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        Tank t3 = new Tank();
        Tank t4 = new Tank();
        Marine m1 = new Marine();
        Marine m2 = new Marine();
        Marine m3 = new Marine();
        Marine m4 = new Marine();
        Marine m5 = new Marine();

        Dropship dropship = new Dropship();
        dropship.load(t1);
        dropship.load(t2);
        dropship.load(t3);
        dropship.load(t4);
        dropship.load(m1);
        dropship.load(m2);
        dropship.load(m3);
        dropship.load(m4);
        dropship.load(m5);
        dropship.check();
        System.out.println("--------");
        Unit u1 = dropship.unload(2);
        dropship.check();
        Unit u2 = dropship.unload(3);
        dropship.check();
        Unit u3 = dropship.unload(3);
        dropship.check();
        dropship.load(m5);
        dropship.check();
        Unit u4 = dropship.unload(3);
        dropship.check();
    }
}
