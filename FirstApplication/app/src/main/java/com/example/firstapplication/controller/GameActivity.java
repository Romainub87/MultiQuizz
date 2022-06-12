package com.example.firstapplication.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.firstapplication.R;
import com.example.firstapplication.model.BanqueQuestions;
import com.example.firstapplication.model.Question;
import com.example.firstapplication.model.Score;

import java.util.Arrays;

public class GameActivity extends AppCompatActivity implements View.OnClickListener{

    private GameActivity game;
    private TextView gameTextView;
    private Button GameButton1;
    private Button GameButton2;
    private Button GameButton3;
    private Button GameButton4;
    public static BanqueQuestions ListQuestions;
    private TextView scoreText;
    public static Score Score;
    private int questionRestante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        gameTextView = findViewById(R.id.Game_TextView);
        GameButton1 = findViewById(R.id.Game_Button1);
        GameButton2 = findViewById(R.id.Game_Button2);
        GameButton3 = findViewById(R.id.Game_Button3);
        GameButton4 = findViewById(R.id.Game_Button4);
        scoreText = findViewById(R.id.Game_ScoreText);
        Score = new Score();
        questionRestante = ListQuestions.taille();

        GameButton1.setOnClickListener(this);
        GameButton2.setOnClickListener(this);
        GameButton3.setOnClickListener(this);
        GameButton4.setOnClickListener(this);

        AfficherQuestion(ListQuestions.getQuestionActuelle());
        AfficherScore();
    }

    public static BanqueQuestions CreationBanqueQuestionFootball(){
        Question question1 = new Question(
                "Quelle est la date de création du FC Girondins de Bordeaux ?",
                Arrays.asList(
                        "1981",
                        "1881",
                        "1891",
                        "1899"
                ),1
        );

        Question question2 = new Question(
                "Combien de trophés possède le FC Girondins de Bordeaux",
                Arrays.asList(
                        "19",
                        "20",
                        "21",
                        "18"
                ),3
        );

        Question question3 = new Question(
                "Quel club a gagné le plus de Ligue des Champions ?",
                Arrays.asList(
                        "Manchester United",
                        "Milan AC",
                        "Real Madrid",
                        "FC Barcelone"
                ),2
        );

        Question question4 = new Question(
                "Quelles équipe(s) a/ont plus de 10 Ligue 1 dans leur palmarès ?",
                Arrays.asList(
                        "Saint-Etienne",
                        "Saint-Etienne / PSG",
                        "Marseille / PSG",
                        "Marseille"
                ),0
        );

        Question question5 = new Question(
                "Combien de Premier League possède Liverpool en 2021 ?",
                Arrays.asList(
                        "19",
                        "20",
                        "17",
                        "18"
                ),0
        );

        Question question6 = new Question(
                "Quel est le plus gros transfert de l'histoire du football (argent)",
                Arrays.asList(
                        "CR7",
                        "Paul Pogba",
                        "Neymar",
                        "Ousmane Dembélé"
                ),2
        );

        Question question7 = new Question(
                "Quel est le meilleur buteur de la Ligue des Champions en 2009-2010 ?",
                Arrays.asList(
                        "CR7 (Real Madrid)",
                        "Lionel Messi (FC Barcelone)",
                        "Kaká (Real Madrid)",
                        "Marouane Chamakh (FC Girondins de Bordeaux)"
                ),1
        );

        Question question8 = new Question(
                "Combien de temps est resté Cristiano Ronaldo au Real Madrid ?",
                Arrays.asList(
                        "10 ans",
                        "8 ans",
                        "9 ans",
                        "11 ans"
                ),2
        );

        Question question9 = new Question(
                "Combien de coupes du Monde possède l'Uruguay",
                Arrays.asList(
                        "2",
                        "1",
                        "3",
                        "0"
                ),0
        );

        Question question10 = new Question(
                "Quel joueur fait gagner la France contre la Croatie en demi-finale de la coupe du Monde 1998 ",
                Arrays.asList(
                        "Laurent Blanc",
                        "Zinedine Zidane",
                        "Lilian Thuram",
                        "Emmanuel Petit"
                ),2
        );

        return new BanqueQuestions(Arrays.asList(question1, question2, question3, question4, question5, question6, question7, question8,question9,question10));

    }

    public static BanqueQuestions CreationBanqueQuestionInformatique(){
        Question question1 = new Question(
          "Que signifie le sigle RAM ?",
                Arrays.asList(
                        "Random Access Memory",
                        "Régler Ampoule Maintenant",
                        "Randomery Access Memory",
                        "Revenir Avec Meuf"
                ),
                0
        );

        Question question2 = new Question(
                "Que signifie le sigle USB ? (en informatique)",
                Arrays.asList(
                        "Université Sciences Bordeaux",
                        "Union des Sept Bières",
                        "Universal Serial Bus",
                        "Universal Serialy Bus"
                ),
                2
        );

        Question question3 = new Question(
                "Quelle est la gamme la plus haute dans les processeurs Intel Core ?",
                Arrays.asList(
                        "a7",
                        "i9",
                        "i7",
                        "a9"
                ),
                1
        );

        Question question4 = new Question(
                "En quelle année Google a été lancé sur le Web ?",
                Arrays.asList(
                        "1997",
                        "1996",
                        "1999",
                        "1998"
                ),
                3
        );
        Question question5 = new Question(
                "Que signifie le sigle FTP ? (en informatique)",
                Arrays.asList(
                        "Fichier Transféré et Partagé",
                        "File Transfer Page",
                        "File Transfer Protocol",
                        "Fichier Très Partagé"
                ),
                2
        );
        Question question6 = new Question(
                "Que signifie le sigle UML ?",
                Arrays.asList(
                        "Union Maximale de Liens",
                        "Unified Modelling Language",
                        "Unité Mauvaise et Laide",
                        "Unified Move of Luge"
                ),
                1
        );
        Question question7 = new Question(
                "Quelle marque a inventé la souris ?",
                Arrays.asList(
                        "Xerox",
                        "Sony",
                        "Microsoft",
                        "HP"
                ),
                0
        );
        Question question8 = new Question(
                "Quelle année a vu naître Internet",
                Arrays.asList(
                        "2000",
                        "1982",
                        "1954",
                        "1969"
                ),
                3
        );
        Question question9 = new Question(
                "Quel était l'ancêtre d'Internet ?",
                Arrays.asList(
                        "ArchiNet",
                        "ArchaNet",
                        "ArpiNet",
                        "ArpaNet"
                ),
                3
        );
        Question question10 = new Question(
                "Que signifie les lettres RGB ?",
                Arrays.asList(
                        "Red Blue Green",
                        "Roue Bas de Gamme",
                        "Rouge Bleu Vert",
                        "Rouge Bas de Gamme"
                ),
                0
        );
        return new BanqueQuestions(Arrays.asList(question1, question2, question3, question4, question5, question6, question7, question8,question9,question10));
    }

    private void AfficherQuestion(final Question question) {
        gameTextView.setText(question.getQuestion());
        GameButton1.setText(question.getChoixQuestion().get(0));
        GameButton2.setText(question.getChoixQuestion().get(1));
        GameButton3.setText(question.getChoixQuestion().get(2));
        GameButton4.setText(question.getChoixQuestion().get(3));
    }
    private void AfficherScore(){
        scoreText.setText(Score.toString());
    }

    @Override
    public void onClick(View view) {
        int index;

        if (view == GameButton1){
            index = 0;
        } else if (view == GameButton2){
            index = 1;
        } else if (view == GameButton3){
            index = 2;
        } else if (view == GameButton4){
            index = 3;
        } else {
            throw new IllegalStateException("View inconnu cliquée" + view);
        }

        if (index == ListQuestions.getQuestionActuelle().getIndexReponse()){
            Score.Plus1();
        }

        questionRestante--;

        if (questionRestante <= 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            if (Score.getScore() > (ListQuestions.taille()/2) && Score.getScore() < ListQuestions.taille()){
                builder.setTitle("Bravo !")
                        .setMessage("Votre nom : " + MainActivity.mUser.toString() + "\nVotre score : " + Score.toString())
                        .setPositiveButton("Menu", (dialogInterface, i) -> finish())
                        .create()
                        .show();
            }else if (Score.getScore() == (ListQuestions.taille())){
                builder.setTitle("T'es le boss !!")
                        .setMessage("Votre nom : " + MainActivity.mUser.toString() + "\nVotre score : " + Score.toString())
                        .setPositiveButton("Menu", (dialogInterface, i) -> finish())
                        .create()
                        .show();
            }else {
                builder.setTitle("Pas ouf...")
                        .setMessage("Votre nom : " + MainActivity.mUser.toString() + "\nVotre score : " + Score.toString())
                        .setPositiveButton("Menu", (dialogInterface, i) -> finish())
                        .create()
                        .show();
            }


        }else {
            scoreText.setText(Score.toString());
            ListQuestions.setIndexProchaineQuestion();
            AfficherQuestion(ListQuestions.getQuestionActuelle());
        }
    }
}