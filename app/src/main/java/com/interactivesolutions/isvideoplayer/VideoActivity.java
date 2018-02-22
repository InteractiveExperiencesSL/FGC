package com.interactivesolutions.isvideoplayer;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

/**
 * Created by pedro on 22/2/18.
 */

public class VideoActivity extends AppCompatActivity {

    private VideoView videoView;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        getSupportActionBar().hide();

        url = getIntent().getStringExtra("url");

        videoView = findViewById(R.id.video_view);
        videoView.setVideoURI(Uri.parse(url));
        videoView.start();
    }

}
