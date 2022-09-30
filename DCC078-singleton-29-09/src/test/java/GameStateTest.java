import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameStateTest {

    @Test
    void shouldReturnMapName() {
        Map map = new Map();
        map.setName("Florest");
        GameState.getInstance().setCurrentMap(map);

        assertEquals("Florest", GameState.getInstance().getCurrentMap().getName());
    }

    @Test
    void shouldReturnNumberOfPlayersOnline() {
        GameState.getInstance().setPlayersOnline(12);

        assertEquals(12, GameState.getInstance().getPlayersOnline());
    }
}