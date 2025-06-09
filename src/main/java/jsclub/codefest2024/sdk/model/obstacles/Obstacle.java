package jsclub.codefest2024.sdk.model.obstacles;

import jsclub.codefest2024.sdk.model.Element;
import jsclub.codefest2024.sdk.model.ElementType;

public class Obstacle extends Element {
    private int hp = -1;

    public Obstacle(String id, ElementType type, int hp) {
        super(id);
        this.hp = hp;
        this.setType(type);
    }

    public Obstacle(String id, ElementType type) {
        super(id);
        this.setType(type);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
