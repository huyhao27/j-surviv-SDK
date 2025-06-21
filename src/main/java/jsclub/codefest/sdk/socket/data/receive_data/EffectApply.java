package jsclub.codefest.sdk.socket.data.receive_data;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import jsclub.codefest.sdk.model.effects.Effect;

public class EffectApply {
    @SerializedName("playerId")
    public String playerId;

    @SerializedName("effect")
    public Effect effect;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
