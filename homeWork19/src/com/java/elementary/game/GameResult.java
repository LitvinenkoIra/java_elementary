package com.java.elementary.game;

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

    @Override
    public boolean equals(Object obj){

        if (obj == null)
            return false;

        if (obj.getClass() != this.getClass())
            return false;

        GameResult gameResult = (GameResult)obj;

        if(gameResult.player == null || gameResult.result == null || gameResult.calendar == null)
            return false;

        if(this.player.equals(gameResult.player) &&
                this.result.equals(gameResult.result) &&
                this.calendar.equals(gameResult.calendar))
            return true;

        return false;
    }

    public String toString() {
        return player +" has "+ result + "; Date: " + calendar.getTime();
    }
}
