package com.good.mpp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    private static CardView button;
    private static CardView button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        click();
    }
    public void click ()
    {

        button = (CardView) findViewById(R.id.card1);
        button2 = (CardView) findViewById(R.id.card2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfileActivity();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVersionActivity();
            }
        });

    }
    public void openProfileActivity(){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void openVersionActivity(){
        Intent intent = new Intent(this, VersionActivity.class);
        startActivity(intent);

    }
    }



