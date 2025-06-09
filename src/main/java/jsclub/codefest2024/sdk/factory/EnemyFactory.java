package jsclub.codefest2024.sdk.factory;

import jsclub.codefest2024.sdk.model.enemies.Enemy;

import java.util.Map;

public class EnemyFactory {
    /**
     * Available Armors
     */
    private static final Map<String, Enemy> enemyMap = Map.of(
//        "CROW", new Enemy("CROW", 10),
//        "PARENT", new Enemy("PARENT", 15),
//        "NINJA_LEAD", new Enemy("NINJA_LEAD", 15),
//        "DOG", new Enemy("DOG", 15),
//        "GRANDPA", new Enemy("GRANDPA", 15),
//        "FLOWER_VASE_FRAGMENT", new Enemy("FLOWER_VASE_FRAGMENT", 2),
        "ENEMY", new Enemy("ENEMY", 15)
    );

    /**
     * Find enemy by id.
     *
     * @param id String to find enemy.
     * @return Enemy mapped with id.
     */
    public static Enemy getEnemyById(String id) {
        return enemyMap.get(id);
    }

    /**
     * Find enemy by id.
     * Set position for enemy
     *
     * @param id String to find enemy.
     * @param x,y int to set position.
     * @return Enemy with updated position,id.
     * @throws CloneNotSupportedException If clone is not supported.
     */
    public static Enemy getEnemy(String id, int x, int y) throws CloneNotSupportedException {
        Enemy enemyBase = getEnemyById(id);

        Enemy enemy = (Enemy) enemyBase.clone();
        enemy.setPosition(x, y);
        enemy.setId(id);

        return enemy;
    }
}