package com.lsw.videoplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lsw.playvideo.media.PlayerView;

public class MainActivity extends AppCompatActivity {
    PlayerView playerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playerView = new PlayerView(MainActivity.this).setPlaySource("http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f20.mp4").startPlay();
    }
}
