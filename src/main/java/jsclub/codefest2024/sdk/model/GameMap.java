package jsclub.codefest2024.sdk.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import jsclub.codefest2024.sdk.model.buildings.Building;
import jsclub.codefest2024.sdk.factory.*;
import jsclub.codefest2024.sdk.model.npcs.*;
import jsclub.codefest2024.sdk.model.equipments.*;
import jsclub.codefest2024.sdk.model.obstacles.*;
import jsclub.codefest2024.sdk.model.players.Player;
import jsclub.codefest2024.sdk.model.weapon.*;
import jsclub.codefest2024.sdk.socket.data.receive_data.Block;
import jsclub.codefest2024.sdk.socket.data.receive_data.Entity;
import jsclub.codefest2024.sdk.socket.data.receive_data.MapData;
import jsclub.codefest2024.sdk.util.MsgPackUtil;

public class GameMap {
    private int mapSize = 0;
    private int safeZone = 0;
    private int darkAreaSize = 0;
    private List<Obstacle> listIndestructibleObstacles = new ArrayList<>();
    private List<Obstacle> listObstacles = new ArrayList<>();
    private List<Enemy> listEnemies = new ArrayList<>();
    private List<Ally> listAllies = new ArrayList<>();
    private List<Weapon> listWeapons = new ArrayList<>();
    private List<HealingItem> listHealingItems = new ArrayList<>();
    private List<Armor> listArmors = new ArrayList<>();
    private List<Bullet> listBullets = new ArrayList<>();
    private List<Player> otherPlayerInfo = new ArrayList<>();
    private List<Building> listBuildings = new ArrayList<>();
    private Player currentPlayer;
    private Inventory heroInventory;


    public GameMap(Inventory heroInventory) {
        this.heroInventory = heroInventory;
    }

    /**
     * Decode message from server when initializing map.
     * update map size and indestructible obstacles attributes
     *
     * @param arg The message parsed from server.
     */
    public void updateOnInitMap(Object arg) {
        try {
            Gson gson = new Gson();
            String message = MsgPackUtil.decode(arg);
            MapData mapData = gson.fromJson(message, MapData.class);
            setMapSize(mapData.mapSize);

            List<Enemy> newListEnemies = new ArrayList<>();
            List<Obstacle> newListObstacles = new ArrayList<>();
            List<Ally> newListAllies = new ArrayList<>();
            for (Enemy e : mapData.listEnemies) {
                Enemy enemy = EnemyFactory.getEnemy(e.getId(), e.getX(), e.getY());
                newListEnemies.add(enemy);
            }
            setListEnemies(newListEnemies);

            for (Ally a : mapData.listAllies){
                Ally ally = AllyFactory.getAlly(a.getId(), a.x, a.y);
                newListAllies.add(ally);
            }
            setListAllies(newListAllies);

            for (Obstacle o : mapData.listObstacles){
                Obstacle obstacle = ObstacleFactory.getObstacle(o.getId(), o.x, o.y);
                newListObstacles.add(obstacle);
            }
            setListObstacles(newListObstacles);



        } catch (CloneNotSupportedException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Decode message from server when updating map.
     * update dark area size and items information
     *
     * @param arg The message parsed from server.
     */
    public void updateOnUpdateMap(Object arg) {
        try {
            Gson gson = new Gson();
            String message = MsgPackUtil.decode(arg);
            MapData mapData = gson.fromJson(message, MapData.class);
            mapData.categorizeMapData();

            List<Obstacle> newListObstacles = new ArrayList<>();
            List<Enemy> newListEnemies = new ArrayList<>();
            List<Ally> newListAllies = new ArrayList<>();
            List<Weapon> newListWeapons = new ArrayList<>();
            List<HealingItem> newListHealingItem = new ArrayList<>();
            List<Armor> newListArmor = new ArrayList<>();

            setSafeZone(mapData.safeZone);

            for (Obstacle o : mapData.listObstacles) {
                Obstacle obstacle = ObstacleFactory.getObstacle(o.getId(), o.getX(), o.getY());
                newListObstacles.add(obstacle);
            }
            setListObstacles(newListObstacles);

            for (Enemy e : mapData.listEnemies) {
                Enemy enemy = EnemyFactory.getEnemy(e.getId(), e.getX(), e.getY());
                newListEnemies.add(enemy);
            }
            setListEnemies(newListEnemies);

            for (Ally a : mapData.listAllies) {
                Ally ally = AllyFactory.getAlly(a.getId(), a.getX(), a.getY());
                newListAllies.add(ally);
            }
            setListEnemies(newListEnemies);

            for (Weapon w : mapData.listWeapons) {
                Weapon weapon = WeaponFactory.getWeapon(w.getId(), w.getX(), w.getY());
                newListWeapons.add(weapon);
            }
            setListWeapons(newListWeapons);

            for (HealingItem h : mapData.listHealingItems) {
                HealingItem healing = HealingItemFactory.getHealingItem(h.getId(), h.getX(), h.getY());
                newListHealingItem.add(healing);
            }
            setListHealingItems(newListHealingItem);

            for (Armor a : mapData.listArmors) {
                Armor armor = ArmorFactory.getArmor(a.getId(), a.getX(), a.getY());
                newListArmor.add(armor);
            }
            setListArmors(newListArmor);

            setListBullets(mapData.listBullet);
            setOtherPlayerInfo(mapData.otherPlayers);
            setCurrentPlayer(mapData.currentPlayer);

            if (!currentPlayer.getIsAlive()) {
                this.heroInventory.reset();
            }
        } catch (CloneNotSupportedException | IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * find element by position
     *
     * @param x,y int Position of element.
     * @return The Element mapped with position.
     */

    public Element getElementByIndex(int x, int y) {
        Element element = null;
        element = this.findElementInListByIndex(x, y, this.listIndestructibleObstacles);
        if (element != null) return element;

        element = this.findElementInListByIndex(x, y, this.listEnemies);
        if (element != null) return element;

        element = this.findElementInListByIndex(x, y, this.listWeapons);
        if (element != null) return element;

        element = this.findElementInListByIndex(x, y, this.listHealingItems);
        if (element != null) return element;

        element = this.findElementInListByIndex(x, y, this.listArmors);
        if (element != null) return element;

        element = this.findElementInListByIndex(x, y, this.listBullets);
        if (element != null) return element;

        element = this.findElementInListByIndex(x, y, this.otherPlayerInfo);
        if (element != null) return element;

        if (this.currentPlayer.x == x && this.currentPlayer.y == y) {
            return this.currentPlayer;
        }

        return new Element(x, y, "ROAD", ElementType.ROAD);
    }

    private Element findElementInListByIndex(int x, int y, List elements) {
        for (Object element : elements) {
            Element e = (Element) element;
            if (e.getX() == x && e.getY() == y) {
                return e;
            }
        }
        return null;
    }

    /**
     * get,set functions
     */

    public List<Obstacle> getObstaclesbyTag(String tag) {
        List<Obstacle> obstacles = new ArrayList<>();
        try {
            ObstacleTag t = ObstacleTag.valueOf(tag);
            for (Obstacle o : listObstacles) {
            if (o.getTag().contains(t)) {
                obstacles.add(o);
            }
        }
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new RuntimeException(e);
        }
        return obstacles;
    }

    public List<Weapon> getAllGun() {
        List<Weapon> guns = new ArrayList<>();
        for (Weapon weapon : listWeapons) {
            if (weapon.getType() == ElementType.GUN) {
                guns.add(weapon);
            }
        }
        return guns;
    }

    public List<Weapon> getAllMelee() {
        List<Weapon> melees = new ArrayList<>();
        for (Weapon weapon : listWeapons) {
            if (weapon.getType() == ElementType.MELEE) {
                melees.add(weapon);
            }
        }
        return melees;
    }

    public List<Weapon> getAllThrowable() {
        List<Weapon> throwables = new ArrayList<>();
        for (Weapon weapon : listWeapons) {
            if (weapon.getType() == ElementType.THROWABLE) {
                throwables.add(weapon);
            }
        }
        return throwables;
    }

    public int getMapSize() {
        return mapSize;
    }

    public int getSafeZone() {
        return safeZone;
    }

    public List<Obstacle> getListIndestructibleObstacles() {
        return listIndestructibleObstacles;
    }

    public List<Obstacle> getListObstacles() {
        return listObstacles;
    }

    public List<Enemy> getListEnemies() {
        return listEnemies;
    }

    public List<Ally> getListAllies() {
        return listAllies;
    }

    public List<Weapon> getListWeapons() {
        return listWeapons;
    }

    public List<HealingItem> getListHealingItems() {
        return listHealingItems;
    }

    public List<Armor> getListArmors() {
        return listArmors;
    }

    public List<Bullet> getListBullets() {
        return listBullets;
    }

    public List<Player> getOtherPlayerInfo() {
        return otherPlayerInfo;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public List<Building> getListBuildings() {
        return listBuildings;
    }

    public void setMapSize(int mapSize) {
        this.mapSize = mapSize;
    }

    public void setSafeZone(int safeZone) {
        this.safeZone = safeZone;
    }

    public void setListIndestructibleObstacles(List<Obstacle> listIndestructibleObstacles) {
        this.listIndestructibleObstacles = listIndestructibleObstacles;
    }

    public void setListObstacles(List<Obstacle> listObstacles) {
        this.listObstacles = listObstacles;
    }

    public void setListEnemies(List<Enemy> listEnemies) {
        this.listEnemies = listEnemies;
    }

    public void setListAllies(List<Ally> listAllies) {
        this.listAllies = listAllies;
    }

    public void setListWeapons(List<Weapon> listWeapons) {
        this.listWeapons = listWeapons;
    }

    public void setListHealingItems(List<HealingItem> listHealingItems) {
        this.listHealingItems = listHealingItems;
    }

    public void setListArmors(List<Armor> listArmors) {
        this.listArmors = listArmors;
    }

    public void setListBullets(List<Bullet> listBullets) {
        this.listBullets = listBullets;
    }

    public void setOtherPlayerInfo(List<Player> otherPlayerInfo) {
        this.otherPlayerInfo = otherPlayerInfo;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void setListBuildings(List<Building> listBuildings) {
        this.listBuildings = listBuildings;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
