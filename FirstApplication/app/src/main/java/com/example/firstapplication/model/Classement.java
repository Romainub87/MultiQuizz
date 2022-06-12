package com.example.firstapplication.model;

import java.util.List;

public class Classement {

    public static List<User> Classement;

    public void ajouterJoueur(User joueur) {
        Classement.add(joueur);
    }

    public void afficher5premiers(List<User> classement) {
        int i = 0;
        StringBuilder affichage = new StringBuilder();
        for (User joueur:classement)
        {
            while (i < 5) {
                affichage.append(joueur.getFirstName());
                affichage.append(" : ");
                affichage.append(joueur.getScore() + "\n");
                i++;
            }
        }
    }
}
