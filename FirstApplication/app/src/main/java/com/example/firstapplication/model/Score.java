package com.example.firstapplication.model;

public class Score {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int Plus1(){
        return score += 1;
    }

    @Override
    public String toString(){
        return " " + score + " ";
    }
}
