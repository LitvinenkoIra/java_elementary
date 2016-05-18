import java.util.Calendar;

public class GameResult {

    private Player player;
    private String result;
    private Calendar calendar;

    public Player getPlayer(){
        return player;
    }

    public String getResult() {
        return result;
    }

    public GameResult(Player player, String result) {
        this.player = player;
        this.result = result;
        this.calendar = Calendar.getInstance();
    }

    public String toString() {
        return player +" has "+ result + "; Date: " + calendar.getTime();
    }
}
