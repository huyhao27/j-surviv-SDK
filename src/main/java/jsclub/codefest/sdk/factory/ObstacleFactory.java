package jsclub.codefest.sdk.factory;

import jsclub.codefest.sdk.model.ElementType;
import jsclub.codefest.sdk.model.obstacles.Obstacle;
import jsclub.codefest.sdk.model.obstacles.ObstacleTag;

import java.util.List;
import java.util.Map;

public class ObstacleFactory {
    /**
     * Available Obstacles
     */
    private static final Map<String, Obstacle> obstacleMap = Map.ofEntries(
        Map.entry("CHEST", new Obstacle("CHEST", ElementType.OBSTACLE, List.of(ObstacleTag.DESTRUCTIBLE, ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED), 20)),
        Map.entry("DRAGON_EGG", new Obstacle("DRAGON_EGG", ElementType.OBSTACLE, List.of(ObstacleTag.DESTRUCTIBLE, ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED),50)),
        Map.entry("HUNT_TRAP", new Obstacle("HUNT_TRAP", ElementType.OBSTACLE, List.of(ObstacleTag.TRAP, ObstacleTag.CAN_GO_THROUGH, ObstacleTag.CAN_SHOOT_THROUGH), 0)),
        Map.entry("SPIKES", new Obstacle("SPIKES", ElementType.OBSTACLE, List.of(ObstacleTag.TRAP, ObstacleTag.CAN_GO_THROUGH, ObstacleTag.CAN_SHOOT_THROUGH), 0)),
        Map.entry("BANANA_PEEL", new Obstacle("BANANA_PEEL", ElementType.OBSTACLE, List.of(ObstacleTag.TRAP, ObstacleTag.CAN_GO_THROUGH, ObstacleTag.CAN_SHOOT_THROUGH) , 0)),
        Map.entry("SMALL_ROCK", new Obstacle("SMALL_ROCK", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("BIG_ROCK", new Obstacle("BIG_ROCK", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("POND", new Obstacle("POND", ElementType.OBSTACLE, List.of(ObstacleTag.CAN_GO_THROUGH, ObstacleTag.CAN_SHOOT_THROUGH, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("TREE", new Obstacle("TREE", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("WELL", new Obstacle("WELL", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("CLOSED_STONE_DOOR", new Obstacle("CLOSED_STONE_DOOR", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("OPENED_STONE_DOOR", new Obstacle("OPENED_STONE_DOOR", ElementType.OBSTACLE, List.of(ObstacleTag.CAN_GO_THROUGH, ObstacleTag.CAN_SHOOT_THROUGH))),      
        Map.entry("FALLEN_TREE", new Obstacle("FALLEN_TREE", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("SKELETON", new Obstacle("SKELETON", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("BLACK_ROSE", new Obstacle("BLACK_ROSE", ElementType.OBSTACLE, List.of(ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("WILD_ROSE", new Obstacle("WILD_ROSE", ElementType.OBSTACLE, List.of(ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("BUSH", new Obstacle("BUSH", ElementType.OBSTACLE, List.of(ObstacleTag.CAN_GO_THROUGH, ObstacleTag.CAN_SHOOT_THROUGH))),      
        Map.entry("BIG_BLACK_ROSE", new Obstacle("BIG_BLACK_ROSE", ElementType.OBSTACLE, List.of(ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("BIG_WILD_ROSE", new Obstacle("BIG_WILD_ROSE", ElementType.OBSTACLE, List.of(ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("STATUE", new Obstacle("STATUE", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("TORCH", new Obstacle("TORCH", ElementType.OBSTACLE, List.of(ObstacleTag.CAN_GO_THROUGH, ObstacleTag.CAN_SHOOT_THROUGH))),      
        Map.entry("RELICS", new Obstacle("RELICS", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("ABANDONED_HOUSE_WALL", new Obstacle("ABANDONED_HOUSE_WALL", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("ABANDONED_HOUSE_DOOR", new Obstacle("ABANDONED_HOUSE_DOOR", ElementType.OBSTACLE, List.of(ObstacleTag.CAN_GO_THROUGH, ObstacleTag.CAN_SHOOT_THROUGH))),      
        Map.entry("RIVER", new Obstacle("RIVER", ElementType.OBSTACLE, List.of(ObstacleTag.CAN_SHOOT_THROUGH, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("POLE", new Obstacle("POLE", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("ANCIENT_WELL", new Obstacle("ANCIENT_WELL", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("LAVA", new Obstacle("LAVA", ElementType.OBSTACLE, List.of(ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("JS_FLAG", new Obstacle("JS_FLAG", ElementType.OBSTACLE, List.of(ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("SEAL_GATE", new Obstacle("SEAL_GATE", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("PORTAL", new Obstacle("PORTAL", ElementType.OBSTACLE, List.of(ObstacleTag.CAN_GO_THROUGH, ObstacleTag.PULLABLE_ROPE))),
        Map.entry("ANCIENT_CLOCK", new Obstacle("ANCIENT_CLOCK", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("ABANDONED_CANON", new Obstacle("ABANDONED_CANON", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("OBSIDIAN", new Obstacle("OBSIDIAN", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("SWAMP", new Obstacle("SWAMP", ElementType.OBSTACLE, List.of(ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("SWORD_HOLDER", new Obstacle("SWORD_HOLDER", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("COAL_ORE", new Obstacle("COAL_ORE", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("FLOWER_OF_LIGHT", new Obstacle("FLOWER_OF_LIGHT", ElementType.OBSTACLE, List.of(ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("ABADONED_CHEST", new Obstacle("ABADONED_CHEST", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("SPIDER_WEB", new Obstacle("SPIDER_WEB", ElementType.OBSTACLE, List.of(ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("MUSHROOM", new Obstacle("MUSHROOM", ElementType.OBSTACLE, List.of(ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("BELL_COLUMN", new Obstacle("BELL_COLUMN", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("MUTANT_FLOWER", new Obstacle("MUTANT_FLOWER", ElementType.OBSTACLE, List.of(ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("ABANDONED_RUINS_WALL", new Obstacle("ABANDONED_RUINS_WALL", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("LUMINOUS_STONE", new Obstacle("LUMINOUS_STONE", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("GIANT_MUSHROOM", new Obstacle("GIANT_MUSHROOM", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED))),      
        Map.entry("GIANT_GLOWING_TREE", new Obstacle("GIANT_GLOWING_TREE", ElementType.OBSTACLE, List.of(ObstacleTag.PULLABLE_ROPE, ObstacleTag.HERO_HIT_BY_BAT_WILL_BE_STUNNED)))
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
