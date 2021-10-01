package com.company.tournament;

import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of players:");
        int noOfPlayers=sc.nextInt();
        System.out.println("Enter the number of rounds:");
        int noOfRounds=sc.nextInt();
        List<Player> playerList=CreatePlayer.generatePlayers(noOfPlayers);
        System.out.println(playerList);
        List<Match> matchList=CreatePlayer.setMatchPool(playerList);
        System.out.println(matchList);
    }
}
