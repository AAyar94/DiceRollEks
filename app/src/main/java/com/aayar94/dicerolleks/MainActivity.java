package com.aayar94.dicerolleks;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    ImageView imageView2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.scoretext);
        button = findViewById(R.id.rollbutton);
        imageView2 = findViewById(R.id.dice2);
        imageView = findViewById(R.id.dice1);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                Random random1 = new Random();
                int score = random.nextInt(6) + 1;
                int score2 = random.nextInt(6) + 1;

                textView.setText(String.valueOf(score + score2));

                switch (score){
                    case 1:
                        imageView.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        imageView.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        imageView.setImageResource(R.drawable.dice6);
                        break;
                }
                switch (score2){
                    case 1:
                        imageView2.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        imageView2.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        imageView2.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        imageView2.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        imageView2.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        imageView2.setImageResource(R.drawable.dice6);
                        break;
                }
            }

        });


    }

}