package StarCraft;

//시즈탱크
public class Tank extends Unit{
    private boolean isSiegeMode;

    @Override
    public String toString(){
        return "시즈탱크@" + super.hashCode();
    }
    public Tank(){

    }
    public void changeMode(){
        isSiegeMode = !isSiegeMode;
        System.out.printf("시즈모드 %s\n", isSiegeMode ? "ON" : "OFF");
    }
}
