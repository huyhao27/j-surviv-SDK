package jsclub.codefest2024.sdk.factory;

import jsclub.codefest2024.sdk.model.equipments.Armor;

import java.io.IOException;
import java.util.Map;


public class ArmorFactory {
    /**
     * Available Armors
     */
    public static final Map<String, Armor> armorMap = Map.of(
        "VEST", new Armor("VEST", 20, 3),
        "POT", new Armor("POT", 20, 2),
        "HELMET", new Armor("HELMET", 20, 1)
    );
    /**
     * Find armor by id.
     *
     * @param id String to find armor.
     * @return Armor mapped with id.
     */
    public static Armor getArmorById(String id) {
        return armorMap.get(id);
    }

    /**
     * Find armor by id.
     * Set position for armor
     *
     * @param id String to find armor.
     * @param x,y int to set position.
     * @return Armor with updated position,id.
     * @throws CloneNotSupportedException If clone is not supported.
     */
    public static Armor getArmor(String id, int x, int y) throws CloneNotSupportedException {
        Armor armorBase = getArmorById(id);

        Armor armor = (Armor) armorBase.clone();
        armor.setPosition(x, y);
        armor.setId(id);
        return armor;
    }
}
