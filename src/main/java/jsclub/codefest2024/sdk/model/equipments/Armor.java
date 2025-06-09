package jsclub.codefest2024.sdk.model.equipments;

import jsclub.codefest2024.sdk.model.Element;
import jsclub.codefest2024.sdk.model.ElementType;

public class Armor extends Element {
    private final int damageReduce;
    private final int point;

    public Armor(String id, int damageReduce, int point) {
        super(id);
        this.damageReduce = damageReduce;
        this.point = point;
        this.setType(ElementType.ARMOR);
    }

    public int getPoint() {
        return point;
    }

    public int getDamageReduce() {
        return damageReduce;
    }
}
