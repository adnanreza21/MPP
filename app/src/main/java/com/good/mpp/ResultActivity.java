package com.good.mpp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private static ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView txtScore = (TextView) findViewById(R.id.textScore);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);

        txtScore.setText("Nilaimu:" + score);
        click();
    }

    public void onClick(View view) {
        Intent intent = new Intent(ResultActivity.this, QuizActivity.class);
        startActivity(intent);
    }

    public void click() {
        img = (ImageView) findViewById(R.id.back);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".MainActivity");
                startActivity(intent);
            }
        });
    }
}
