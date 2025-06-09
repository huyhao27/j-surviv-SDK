package jsclub.codefest2024.sdk.socket.data.emit_data;

import com.google.gson.annotations.SerializedName;

public class PlayerJoinGameAction {
    @SerializedName("game_id")
    private String gameID;

    @SerializedName("player_name")
    private String playerName;

    public PlayerJoinGameAction(String gameID, String playerName) {
        this.gameID = gameID;
        this.playerName = playerName;
    }
}
