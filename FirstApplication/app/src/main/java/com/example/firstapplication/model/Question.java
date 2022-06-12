package com.example.firstapplication.model;

import java.util.List;

public class Question {
    private final String question;
    private final int IndexReponse;
    private final List<String> ChoixQuestion;

    public String getQuestion() {
        return question;
    }

    public List<String> getChoixQuestion() {
        return ChoixQuestion;
    }

    public int getIndexReponse() {
        return IndexReponse;
    }

    public Question(String question, List<String> choixQuestion, int indexReponse) {
        this.question = question;
        ChoixQuestion = choixQuestion;
        IndexReponse = indexReponse;
    }

}
