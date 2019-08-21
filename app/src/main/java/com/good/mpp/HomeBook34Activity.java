package com.good.mpp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeBook34Activity extends AppCompatActivity {
    private static Button button;
    private static Button button2;
    private static Button button3;
    private static Button button4;
    private static Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_book34);

        click();
    }
    public void click ()
    {

        button = (Button) findViewById(R.id.but1);
        button2 = (Button) findViewById(R.id.but2);
        button3 = (Button) findViewById(R.id.but3);
        button4 = (Button) findViewById(R.id.but4);
        button5 = (Button) findViewById(R.id.but5);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook34SatuActivity();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook34DuaActivity();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook34TigaActivity();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook34EmpatActivity();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook34LimaActivity();
            }
        });

    }
    public void openBook34SatuActivity(){
        Intent intent = new Intent(this, Book34SatuActivity.class);
        startActivity(intent);
    }

    public void openBook34DuaActivity(){
        Intent intent = new Intent(this, Book34DuaActivity.class);
        startActivity(intent);

    }
    public void openBook34TigaActivity(){
        Intent intent = new Intent(this, Book34TigaActivity.class);
        startActivity(intent);

    }
    public void openBook34EmpatActivity(){
        Intent intent = new Intent(this, Book34EmpatActivity.class);
        startActivity(intent);

    }
    public void openBook34LimaActivity(){
        Intent intent = new Intent(this, Book34LimaActivity.class);
        startActivity(intent);

    }
}



