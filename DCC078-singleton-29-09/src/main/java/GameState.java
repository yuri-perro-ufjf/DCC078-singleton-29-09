public class GameState {

    private GameState(){};
    private static final GameState instance = new GameState();
    public static GameState getInstance(){
        return instance;
    }

    private Map currentMap;
    private Integer playersOnline;

    public Integer getPlayersOnline() {
        return playersOnline;
    }

    public void setPlayersOnline(Integer playersOnline) {
        this.playersOnline = playersOnline;
    }

    public Map getCurrentMap() {
        return currentMap;
    }

    public void setCurrentMap(Map currentMap) {
        this.currentMap = currentMap;
    }
}
