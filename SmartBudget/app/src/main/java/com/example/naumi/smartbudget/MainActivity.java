package com.example.naumi.smartbudget;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button loginButton;
    private Button quizButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton(){
        quizButton = (Button) findViewById(R.id.quizBut);
        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuizActivity();
            }
        });

        loginButton = (Button) findViewById(R.id.loginBut);

    }

    public void openQuizActivity(){
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }


}
