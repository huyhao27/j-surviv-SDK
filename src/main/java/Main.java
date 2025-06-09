import io.socket.emitter.Emitter;
import jsclub.codefest2024.sdk.Hero;
import jsclub.codefest2024.sdk.model.GameMap;

import java.io.IOException;

public class Main {
    private static final String SERVER_URL = "https://cf25-server-staging.jsclub.dev";
    private static final String GAME_ID = "144535";
    private static final String PLAYER_NAME = "phi";
    private static final String PLAYER_KEY = "123123";

    public static void main(String[] args) throws IOException {
        Hero hero = new Hero(GAME_ID, PLAYER_NAME,PLAYER_KEY);

        Emitter.Listener onMapUpdate = new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                System.out.println("Start a try");
                GameMap gameMap = hero.getGameMap(); // map
                gameMap.updateOnUpdateMap(args[0]);
            }
        };
        hero.setOnMapUpdate(onMapUpdate);
        hero.start(SERVER_URL);
    }
}
