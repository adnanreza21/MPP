package com.good.mpp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Video2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video2);
        TextView t = (TextView) findViewById(R.id.txtt1);
        t.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t1 = (TextView) findViewById(R.id.txtt2);
        t1.setMovementMethod(LinkMovementMethod.getInstance());


        TextView t2 = (TextView) findViewById(R.id.txtt3);
        t2.setMovementMethod(LinkMovementMethod.getInstance());


        TextView t3 = (TextView) findViewById(R.id.txtt4);
        t3.setMovementMethod(LinkMovementMethod.getInstance());

    }

}
