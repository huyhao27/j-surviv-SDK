package jsclub.codefest2024.sdk.model.weapon;

import com.google.gson.annotations.SerializedName;
import jsclub.codefest2024.sdk.model.Element;
import jsclub.codefest2024.sdk.model.ElementType;

public class Bullet extends Element {
    private final int damage = 0;
    private final int speed = 0;

    @SerializedName("destination_x")
    private final int destinationX = 0;

    @SerializedName("destination_y")
    private final int destinationY = 0;

    public Bullet() {
        setId("BULLET");
        setType(ElementType.BULLET);
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDestinationX() {
        return destinationX;
    }

    public int getDestinationY() {
        return destinationY;
    }
}
