package jsclub.codefest2024.sdk.socket.data.receive_data;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import jsclub.codefest2024.sdk.model.enemies.Enemy;
import jsclub.codefest2024.sdk.model.equipments.Armor;
import jsclub.codefest2024.sdk.model.equipments.HealingItem;
import jsclub.codefest2024.sdk.model.obstacles.Obstacle;
import jsclub.codefest2024.sdk.model.players.Player;
import jsclub.codefest2024.sdk.model.weapon.Bullet;
import jsclub.codefest2024.sdk.model.weapon.Weapon;

import java.util.List;

public class MapData {
    @SerializedName("map_size")
    public int mapSize;

    @SerializedName("dark_area_size")
    public int darkAreaSize;

    @SerializedName("list_indestructible")
    public List<Obstacle> listIndestructible;

    @SerializedName("list_traps")
    public List<Obstacle> listTraps;

    @SerializedName("list_chests")
    public List<Obstacle> listChests;

    @SerializedName("list_enemies")
    public List<Enemy> listEnemies;

    @SerializedName("list_weapons")
    public List<Weapon> listWeapons;

    @SerializedName("list_healing_items")
    public List<HealingItem> listHealingItems;

    @SerializedName("list_armors")
    public List<Armor> listArmors;

    @SerializedName("list_bullet")
    public List<Bullet> listBullet;

    @SerializedName("other_players")
    public List<Player> otherPlayers;

    @SerializedName("current_player")
    public Player currentPlayer;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
