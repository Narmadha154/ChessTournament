package com.company.tournament;

public class Match {
    private String location;
    private Player winner;
    private Player loser;
    private Player player;
    private Player opponent;
    private int draw_prob_rate=10;
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Player getWinner() {
        return winner;
    }
    public void setWinner(Player winner) {
        this.winner = winner;
    }
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public Player getOpponent() {
        return opponent;
    }
    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }
    public String toString(){
        return this.player+" "+this.opponent;
    }
}
