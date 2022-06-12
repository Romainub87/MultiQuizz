package com.example.firstapplication.model;

import java.util.Collections;
import java.util.List;

public class BanqueQuestions {

    private final List<Question> ListeQuestions;
    private int IndexProchaineQuestion;

    public BanqueQuestions(List<Question> listeQuestions) {
        ListeQuestions = listeQuestions;
        Collections.shuffle(ListeQuestions);
    }

    public Question getQuestionActuelle() {
        return ListeQuestions.get(IndexProchaineQuestion);
    }

    public void setIndexProchaineQuestion() {
        IndexProchaineQuestion++;
    }

    public int taille() {
        return ListeQuestions.size();
    }

}
