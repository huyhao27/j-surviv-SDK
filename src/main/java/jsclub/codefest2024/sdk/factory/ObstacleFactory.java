package jsclub.codefest2024.sdk.factory;

import jsclub.codefest2024.sdk.model.ElementType;
import jsclub.codefest2024.sdk.model.obstacles.Obstacle;

import java.util.Map;

public class ObstacleFactory {
    /**
     * Available Obstacles
     */
    private static final Map<String, Obstacle> obstacleMap = Map.of(
        "CHEST", new Obstacle("CHEST", ElementType.CHEST ,20),
        "SPECIAL_CHEST", new Obstacle("SPECIAL_CHEST", ElementType.CHEST ,20),
        "GAS_TANK", new Obstacle("GAS_TANK", ElementType.TRAP,40),
        "FLOWER_VASE", new Obstacle("FLOWER_VASE", ElementType.TRAP,40),
        "INDESTRUCTIBLE_OBSTACLE", new Obstacle("INDESTRUCTIBLE_OBSTACLE", ElementType.INDESTRUCTIBLE_OBSTACLE)
    );

    /**
     * Find obstacle by id.
     *
     * @param id String to find obstacle.
     * @return Obstacle mapped with id.
     */
    public static Obstacle getObstacleById(String id){
        return obstacleMap.get(id);
    }

    /**
     * use for setting indestructible obstacles
     * Find obstacle by id.
     * Set position for obstacle
     *
     * @param id String to find obstacle.
     * @param x,y int to set position.
     * @return Obstacle with updated position,id.
     * @throws CloneNotSupportedException If clone is not supported.
     */
    public static Obstacle getObstacle(String id, int x, int y) throws CloneNotSupportedException {
        Obstacle obstacleBase = getObstacleById(id);

        Obstacle obstacle = (Obstacle) obstacleBase.clone();
        obstacle.setId(id);
        obstacle.setPosition(x,y);

        return obstacle;
    }

    /**
     * use for setting destructible obstacles
     * Find obstacle by id.
     * Set position for obstacle
     *
     * @param id String to find obstacle.
     * @param x,y int to set position.
     * @param hp int to set healing point.
     * @return Obstacle with updated position,hp,id.
     * @throws CloneNotSupportedException If clone is not supported.
     */
    public static Obstacle getObstacle(String id, int x, int y, int hp) throws CloneNotSupportedException {
        Obstacle obstacleBase = getObstacleById(id);
        Obstacle obstacle = (Obstacle) obstacleBase.clone();

        obstacle.setHp(hp);
        obstacle.setId(id);
        obstacle.setPosition(x,y);

        return obstacle;
    }
}
