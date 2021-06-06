package com.asmaa.videostreaming220204447;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;

import java.net.URI;

public class VideoActivity extends AppCompatActivity {
    PlayerView playerView;
    SimpleExoPlayer player;
    String url;
    private boolean playWhenReady = true;
    int currentWindow=0;
    long playBackPosition =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        playerView = findViewById(R.id.video_view);
        url = getIntent().getStringExtra("url");

        Log.d("asmaa", "onCreate: "+url);

    }
    private void initVido(){
        player = ExoPlayerFactory.newSimpleInstance(this);
        playerView.setPlayer(player);
        Uri uri = Uri.parse(url);
        DataSource.Factory dataSourse = new DefaultDataSourceFactory(this,"exoplayer-codelab");
        MediaSource mediaSource = new ProgressiveMediaSource.Factory(dataSourse).createMediaSource(uri);
        player.setPlayWhenReady(playWhenReady);
        player.seekTo(currentWindow,playBackPosition);
        player.prepare(mediaSource,false,false);
    }
public void releaseVide(){
        if (player != null){
            playWhenReady = player.getPlayWhenReady();
            playBackPosition=player.getCurrentPosition();
            currentWindow=player.getCurrentWindowIndex();
            player.release();
            player=null;
        }
}
    @Override
    protected void onStart() {
        super.onStart();
        initVido();
    }

    @Override
    protected void onPause() {
        super.onPause();
      releaseVide();
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        if (player!=null){
//            initVido();
//        }
//    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseVide();

    }
}