package com.java.elementary.game;

import java.util.ArrayList;
import java.util.List;

public class Statistics {

    private List<GameResult> results = new ArrayList<GameResult>();
    private static Statistics instance = null;

    public Statistics(){}

    public static Statistics getInstance(){
        if(instance == null){
            instance = new Statistics();
        }
        return instance;
    }


    public void addResult(GameResult result) {
        results.add(result);
    }

    /*public void showWinners(Player playerX, Player playerO) {
        int X = 0, O = 0;
        for (int i = 0; i < results.size(); i++) {
            GameResult temp = results.get(i);
            if (temp.getResult().equals("win")) {
                if (temp.getPlayer().getType() == 'X')
                    X++;
                else
                    O++;
            }
        }
        System.out.println(playerX.toString() + " has win " + X + " times");
        System.out.println(playerO.toString() + " has win " + O + " times");
    }

    public void showLosses(Player playerX, Player playerO) {
        int X = 0, O = 0;
        for (int i = 0; i < results.size(); i++) {
            GameResult temp = results.get(i);
            if (temp.getResult().equals("lost")) {
                if (temp.getPlayer().getType() == 'X')
                    X++;
                else
                    O++;
            }
        }
        System.out.println(playerX.toString() + " has lost " + X + " times");
        System.out.println(playerO.toString() + " has lost " + O + " times");
    }*/

    @Override
    public String toString() {
        String statistics = "";
        for (GameResult result : results) {
            statistics = statistics + result + '\n';
        }
        return statistics;
    }
}
