package com.interactivesolutions.isvideoplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private SquareRelativeLayout r1, r2, r3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        r1 = findViewById(R.id.rvideo1);
        r2 = findViewById(R.id.rvideo2);
        r3 = findViewById(R.id.rvideo3);

        r1.setTag("android.resource://" + getPackageName() + "/" + R.raw.videosample);
        r2.setTag("android.resource://" + getPackageName() + "/" + R.raw.videosample2);
        r3.setTag("android.resource://" + getPackageName() + "/" + R.raw.videosample3);

        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, VideoActivity.class);
        intent.putExtra("url", v.getTag().toString());
        startActivity(intent);
    }
}
