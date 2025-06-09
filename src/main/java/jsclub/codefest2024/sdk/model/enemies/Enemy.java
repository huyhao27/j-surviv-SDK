package jsclub.codefest2024.sdk.model.enemies;

import jsclub.codefest2024.sdk.model.Element;
import jsclub.codefest2024.sdk.model.ElementType;

public class Enemy extends Element {
    private final int damage;

    public Enemy(String id, int damage) {
        super(id);
        this.damage = damage;
        this.setType(ElementType.ENEMY);
    }

    public int getDamage() {
        return damage;
    }
}
