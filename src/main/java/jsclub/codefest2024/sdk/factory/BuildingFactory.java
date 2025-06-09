package jsclub.codefest2024.sdk.factory;

import jsclub.codefest2024.sdk.base.Node;
import jsclub.codefest2024.sdk.model.buildings.Building;
import jsclub.codefest2024.sdk.model.buildings.ShapeType;

import java.util.Map;

public class BuildingFactory {

    private static final Map<String, Building> buildingMap = Map.ofEntries(
            Map.entry("ABANDONED_HOUSE", new Building("ABANDONED_HOUSE", ShapeType.RECTANGLE)),
            Map.entry("ABANDONED_RUINS", new Building("ABANDONED_RUINS", ShapeType.CIRCLE))
    );

    /**
     * Find building by id.
     *
     * @param id String to find building.
     * @return Building mapped with id.
     */
    public static Building getBuildingById(String id){
        return buildingMap.get(id);
    }

    /**
     * use for setting building
     * Find obstacle by id.
     * Set limit position and landmark for building
     *
     * @param id String to find obstacle.
     * @param limitPos and landmarkPos to set position and limit for building.
     * @return Obstacle with updated position,id.
     * @throws CloneNotSupportedException If clone is not supported.
     */
    public static Building getBuilding(String id, Node limitPos, Node landmarkPos) throws CloneNotSupportedException {
        Building buildingBase = getBuildingById(id);

        Building building = (Building) buildingBase.clone();
        building.setId(id);
        building.setLimitPos(limitPos);
        building.setLandmarkPos(landmarkPos);

        return building;
    }

}
