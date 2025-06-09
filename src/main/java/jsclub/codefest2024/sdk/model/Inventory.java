package jsclub.codefest2024.sdk.model;

import jsclub.codefest2024.sdk.factory.ArmorFactory;
import jsclub.codefest2024.sdk.factory.HealingItemFactory;
import jsclub.codefest2024.sdk.factory.WeaponFactory;
import jsclub.codefest2024.sdk.model.equipments.Armor;
import jsclub.codefest2024.sdk.model.equipments.HealingItem;
import jsclub.codefest2024.sdk.model.weapon.Weapon;
import jsclub.codefest2024.sdk.socket.data.receive_data.ItemData;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private Weapon gun;
    private Weapon melee;
    private Weapon throwable;
    private Weapon special;
    private List<Armor> listArmor = new ArrayList<>();

    private List<HealingItem> listHealingItem = new ArrayList<>();

    public Inventory(List<ItemData> items) {
        for (ItemData n : items) {
            if (n.getType().equals(ElementType.GUN))
                this.gun = WeaponFactory.getWeaponById(n.getID());
            if (n.getType().equals(ElementType.MELEE))
                this.melee =  WeaponFactory.getWeaponById(n.getID());
            if (n.getType().equals(ElementType.THROWABLE))
                this.throwable =  WeaponFactory.getWeaponById(n.getID());
            if (n.getType().equals(ElementType.SPECIAL))
                this.special =  WeaponFactory.getWeaponById(n.getID());
            if (n.getType().equals(ElementType.ARMOR))
                this.listArmor.add(ArmorFactory.getArmorById(n.getID()));
            if (n.getType().equals(ElementType.HEALING_ITEM))
                this.listHealingItem.add(HealingItemFactory.getHealingItemById(n.getID()));

        }

    }

    public Inventory() {
        // Set default value for melee is HAND
        this.melee = WeaponFactory.getWeaponById("HAND");
    }

    public Weapon getGun() {
        return gun;
    }

    public void setGun(Weapon gun) {
        this.gun = gun;
    }

    public Weapon getMelee() {
        return melee;
    }

    public void setMelee(Weapon melee) {
        this.melee = melee;
    }

    public Weapon getThrowable() {
        return throwable;
    }

    public void setThrowable(Weapon throwable) {
        this.throwable = throwable;
    }

    public Weapon getSpecial() {
        return special;
    }

    public void setSpecial(Weapon special) {
        this.special = special;
    }

    public List<HealingItem> getListHealingItem() {
        return listHealingItem;
    }

    public void setListHealingItem(List<HealingItem> listHealingItem) {
        this.listHealingItem = listHealingItem;
    }

    public List<Armor> getListArmor() {
        return listArmor;
    }

    public void setListArmor(List<Armor> listArmor) {
        this.listArmor = listArmor;
    }

    public void reset() {
        this.setGun(null);
        this.setMelee(WeaponFactory.getWeaponById("HAND"));
        this.setThrowable(null);
        this.setSpecial(null);
        this.setListArmor(new ArrayList<>());
        this.setListHealingItem(new ArrayList<>());
    }
}
