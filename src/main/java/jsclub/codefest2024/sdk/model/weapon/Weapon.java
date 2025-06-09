package jsclub.codefest2024.sdk.model.weapon;

import jsclub.codefest2024.sdk.model.Element;
import jsclub.codefest2024.sdk.model.ElementType;
import jsclub.codefest2024.sdk.model.effects.Effect;
import java.util.List;

public class Weapon extends Element {
    private int rarity = 0;
    private int pickupPoints = 0;
    private int hitPoints = 0;
    private double cooldown = 0;
    private int useCounts = 0;
    private int damage = 0;
    private int range = 0;
    private int explosionRange = 0;
    private AttackRange attackRange = null;
    private Bullet bullet = new Bullet();
    private List<Effect> effects;


    public Weapon(String id, ElementType type, int rarity, int pickupPoints, int hitPoints, double cooldown, int useCounts, int damage, int range, int explosionRange, AttackRange attackRange, Bullet bullet, List<Effect> effects) {
        super(id);
        this.rarity = rarity;
        this.pickupPoints = pickupPoints;
        this.hitPoints = hitPoints;
        this.cooldown = cooldown;
        this.useCounts = useCounts;
        this.damage = damage;
        this.range = range;
        this.explosionRange = explosionRange;
        this.attackRange = attackRange;
        this.bullet = bullet;
        this.setType(type);
        this.effects = effects;
    }

    public List<Effect> getEffects() {
        return effects;
    }

    public void setEffects(List<Effect> effects) {
        this.effects = effects;
    }

    public int getRarity() {
        return rarity;
    }

    public int getPickupPoints() {
        return pickupPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getCooldown() {
        return cooldown;
    }

    public int getUseCounts() {
        return useCounts;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public int getExplosionRange() {
        return explosionRange;
    }

    public AttackRange getAttackRange() {
        return attackRange;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public void setPickupPoints(int pickupPoints) {
        this.pickupPoints = pickupPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setCooldown(double cooldown) {
        this.cooldown = cooldown;
    }

    public void setUseCounts(int useCounts) {
        this.useCounts = useCounts;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setExplosionRange(int explosionRange) {
        this.explosionRange = explosionRange;
    }

    public void setAttackRange(AttackRange attackRange) {
        this.attackRange = attackRange;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
