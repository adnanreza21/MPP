package com.good.mpp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static CardView card1, card2, card3, card4, card5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click();
    }
    public void click ()
    {
        card1 = (CardView) findViewById(R.id.cardmat);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".BookActivity");
                startActivity(intent);
            }
        });
        card2 = (CardView) findViewById(R.id.cardkuis);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".QuizActivity");
                startActivity(intent);
            }
        });
        card3 = (CardView) findViewById(R.id.cardvid);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".Video2Activity");
                startActivity(intent);
            }
        });
        card4 = (CardView) findViewById(R.id.cardkd);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".Main2Activity");
                startActivity(intent);
            }
        });
        card5 = (CardView) findViewById(R.id.cardprofil);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".HomeActivity");
                startActivity(intent);
            }
        });

    }

}
