package jsclub.codefest2024.sdk.buildings;

import jsclub.codefest2024.sdk.base.Node;
import jsclub.codefest2024.sdk.model.Element;
import jsclub.codefest2024.sdk.model.ElementType;

public class Building extends Element {
    private ShapeType shapeType;
    private Node limitPos; // toa do gioi han
    private Node landmarkPos; // toa do moc

    public Building(String id, ShapeType shapeType) {
        super(id);
        this.shapeType = shapeType;
        this.setType(ElementType.BUILDING);
    }

    public Building(String id, ShapeType shapeType, Node limitPos, Node landmarkPos) {
        super(id);
        this.setType(ElementType.BUILDING);
        this.shapeType = shapeType;
        this.limitPos = limitPos;
        this.landmarkPos = landmarkPos;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public Node getLimitPos() {
        return limitPos;
    }

    public Node getLandmarkPos() {
        return landmarkPos;
    }

    public void setLandmarkPos(Node landmarkPos) {
        this.landmarkPos = landmarkPos;
    }

    public void setLimitPos(Node limitPos) {
        this.limitPos = limitPos;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }
}
