package com.good.mpp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeBook36Activity extends AppCompatActivity {
    private static Button button;
    private static Button button2;
    private static Button button3;
    private static Button button4;
    private static Button button5;
    private static Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_book36);

        click();
    }
    public void click ()
    {

        button = (Button) findViewById(R.id.but1);
        button2 = (Button) findViewById(R.id.but2);
        button3 = (Button) findViewById(R.id.but3);
        button4 = (Button) findViewById(R.id.but4);
        button5 = (Button) findViewById(R.id.but5);
        button6 = (Button) findViewById(R.id.but6);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook36SatuActivity();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook36DuaActivity();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook36TigaActivity();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook36EmpatActivity();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook36LimaActivity();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook36EnamActivity();
            }
        });

    }
    public void openBook36SatuActivity(){
        Intent intent = new Intent(this, Book36SatuActivity.class);
        startActivity(intent);
    }

    public void openBook36DuaActivity(){
        Intent intent = new Intent(this, Book36DuaActivity.class);
        startActivity(intent);

    }
    public void openBook36TigaActivity(){
        Intent intent = new Intent(this, Book36TigaActivity.class);
        startActivity(intent);

    }
    public void openBook36EmpatActivity(){
        Intent intent = new Intent(this, Book36EmpatActivity.class);
        startActivity(intent);

    }
    public void openBook36LimaActivity(){
        Intent intent = new Intent(this, Book36LimaActivity.class);
        startActivity(intent);

    }
    public void openBook36EnamActivity(){
        Intent intent = new Intent(this, Book36EnamActivity.class);
        startActivity(intent);

    }
}



