package jsclub.codefest.sdk.socket.data.receive_data;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class EffectClear {
    @SerializedName("playerId")
    public String playerId;

    @SerializedName("effectId")
    public String effectId;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
