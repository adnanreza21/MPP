package com.good.mpp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class BookActivity extends AppCompatActivity {

    private static CardView card1, card2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        click();
    }
    public void click ()
    {

        card1 = (CardView) findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".HomeBook34Activity");
                startActivity(intent);
            }
        });
        card2 = (CardView) findViewById(R.id.card2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".HomeBook36Activity");
                startActivity(intent);
            }
        });
    }

}
