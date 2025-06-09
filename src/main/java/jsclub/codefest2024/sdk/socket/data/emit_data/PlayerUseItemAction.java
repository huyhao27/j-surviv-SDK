package jsclub.codefest2024.sdk.socket.data.emit_data;

import com.google.gson.annotations.SerializedName;

public class PlayerUseItemAction {
    @SerializedName("item_id")
    private String itemId;

    public PlayerUseItemAction(String itemId) {
        this.itemId = itemId;
    }
}
