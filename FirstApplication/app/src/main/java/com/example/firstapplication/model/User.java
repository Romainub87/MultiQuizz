package com.example.firstapplication.model;

public class User {


    private String mFirstName;
    private Score score;

    public User(String mFirstName) {
        this.mFirstName = mFirstName;
        this.score = new Score();
    }

    public Score getScore(){
        return score;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    @Override
    public String toString(){
        return " " + mFirstName + " ";
    }


}
