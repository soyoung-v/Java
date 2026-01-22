package StarCraft;

//수송선
public class Dropship extends Unit {
    //8개의 유닛을 태울 수 있는 공간 필요
    private Unit[] units = new Unit[8];
    private int idx = 0;

    public void load(Unit unit) {
        if (idx < units.length) {
            units[idx++] = unit;
        } else {
            System.out.printf("탑승불가 : %s\n", unit);
        }
    }

    public void check() {
        for (int i = 0; i < units.length; i++) {
            System.out.printf("[%d]: %s\n", i, units[i]);
        }
    }

    public Unit unload(int num) {
        Unit unload = units[num];
        for (int i = num; i < idx; i++) {
            if (i == idx - 1) {
                units[i] = null;
            } else {
                units[i] = units[i + 1];
            }
        }
        idx--;
        return unload;
    }
}