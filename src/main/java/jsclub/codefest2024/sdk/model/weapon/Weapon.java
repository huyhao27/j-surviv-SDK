package jsclub.codefest2024.sdk.model.weapon;

import com.google.gson.Gson;
import jsclub.codefest2024.sdk.model.Element;
import jsclub.codefest2024.sdk.model.ElementType;

public class Weapon extends Element {
    private int point = 0;
    private int damage = 0;
    private int obstacleDamage = 0;
    private int cooldown = 0;
    private int capacity = 0;
    private int range = 0;

    public Weapon(String id, ElementType type, int damage, int obstacleDamage, int capacity, int range) {
        super(id);
        this.damage = damage;
        this.obstacleDamage = obstacleDamage;
        this.capacity = capacity;
        this.range = range;

        this.setType(type);
        this.setDefaultParam();
    }

    public void setDefaultParam() {
        switch (this.getType()) {
            case GUN -> {
                this.point = 1;
                this.cooldown = 2;
            }
            case MELEE -> {
                this.point = 3;
                this.cooldown = 5;
            }
            case THROWABLE -> {
                this.point = 2;
            }
        }
    }

    public int getPoint() {
        return point;
    }

    public int getDamage() {
        return damage;
    }

    public int getObstacleDamage() {
        return obstacleDamage;
    }

    public int getCooldown() {
        return cooldown;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRange() {
        return range;
    }
}
