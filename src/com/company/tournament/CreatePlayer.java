package com.company.tournament;

import java.util.ArrayList;
import java.util.List;

public class CreatePlayer {
    public static List generatePlayers(int noOfPlayers){
        List<Player> playerList=new ArrayList<>();
        for(int i=1;i<=noOfPlayers;i++){
            Player play=new Player("Player"+i);
            playerList.add(play);
        }
        return playerList;
    }
    public static List setMatchPool(List<Player> playerList){
        List<Match> matchList=new ArrayList<>();
        for(int i=0;i<playerList.size();i++){
            for(int j=i+1;j<playerList.size();j++){
                Match match=new Match();
                match.setPlayer(playerList.get(i));
                match.setOpponent(playerList.get(j));
                matchList.add(match);
            }
        }
        return matchList;
    }
}
