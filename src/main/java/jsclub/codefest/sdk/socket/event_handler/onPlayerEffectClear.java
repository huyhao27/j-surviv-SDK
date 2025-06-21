package jsclub.codefest.sdk.socket.event_handler;

import com.google.gson.Gson;
import io.socket.emitter.Emitter;
import jsclub.codefest.sdk.socket.data.receive_data.EffectClear;
import jsclub.codefest.sdk.util.MsgPackUtil;

import java.io.IOException;
import java.util.Map;

public class onPlayerEffectClear implements Emitter.Listener {
    Gson gson = new Gson();

    @Override
    public void call(Object... args) {
        try {
            String message = MsgPackUtil.decode(args[0]);
            Map<String, Object> clearData = gson.fromJson(message, Map.class);
            Object value = clearData.get("effectId");
            System.out.println("Effect cleared: " + value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
