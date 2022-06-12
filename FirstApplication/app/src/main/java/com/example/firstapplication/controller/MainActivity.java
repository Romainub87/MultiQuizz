package com.example.firstapplication.controller;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstapplication.R;
import com.example.firstapplication.model.User;

public class MainActivity extends AppCompatActivity {

    private EditText mainEditText;
    private TextView classementTextView;
    private Button mainButton;
    public static User mUser;
    private Button footballButton;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        classementTextView = findViewById(R.id.classement);
        mainEditText = findViewById(R.id.main_EditText);
        mainButton = findViewById(R.id.informatique_Button);
        footballButton = findViewById(R.id.football_Button);
        Button quitterButton = findViewById(R.id.Quitter);
        quitterButton.setEnabled(true);
        quitterButton.setText("Quitter");
        mainButton.setEnabled(false);
        footballButton.setEnabled(false);
        mainEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int before) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mainButton.setEnabled(!s.toString().isEmpty());
                footballButton.setEnabled(!s.toString().isEmpty());
            }
        });

        mainButton.setOnClickListener(view -> {
            Intent gameActivityIntent = new Intent(MainActivity.this, GameActivity.class);
            startActivity(gameActivityIntent);
            mUser = new User(mainEditText.getText().toString());
            GameActivity.ListQuestions = GameActivity.CreationBanqueQuestionInformatique();
        });

        footballButton.setOnClickListener(view -> {
            Intent gameActivityIntent = new Intent(MainActivity.this, GameActivity.class);
            startActivity(gameActivityIntent);
            mUser = new User(mainEditText.getText().toString());
            GameActivity.ListQuestions = GameActivity.CreationBanqueQuestionFootball();
        });

        quitterButton.setOnClickListener(view -> finish());
    }
}