package com.company.tournament;

public class Player {
    static int playerCount=0;
    private int playerId;
    private String name;
    private int noOfMatch;
    private int win;
    private int lose;
    private int draw;
    private long point;
    private int currentRating;
    public Player(String name){
        this.name=name;
        playerCount+=1;
        playerId=playerCount;
        this.noOfMatch=0;
        this.win=0;
        this.lose=0;
        this.draw=0;
        this.currentRating=0;
    }
    public int getNoOfMatch() {
        return noOfMatch;
    }
    public void setNoOfMatch(int noOfMatch) {
        this.noOfMatch = noOfMatch;
    }
    public int getWin() {
        return win;
    }
    public void setWin(int win) {
        this.win = win;
    }
    public int getLose() {
        return lose;
    }
    public void setLose(int lose) {
        this.lose = lose;
    }
    public int getDraw() {
        return draw;
    }
    public void setDraw(int draw) {
        this.draw = draw;
    }
    public long getPoint() {
        return point;
    }
    public void setPoint(long point) {
        this.point = point;
    }
    public int getCurrentRating() {
        return currentRating;
    }
    public void setCurrentRating(int currentRating) {
        this.currentRating = currentRating;
    }
    public String toString(){
        return this.name+" "+this.playerId;
    }
}
