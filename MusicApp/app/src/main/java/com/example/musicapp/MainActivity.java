package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnReproducir;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReproducir =(Button)findViewById(R.id.btnReproducir);
        mp = MediaPlayer.create(this, R.raw.Aundio);
        btnReproducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp.isPlaying()){
                    mp.pause();
                    btnReproducir.setBackgroundResource(R.drawable.pausa);
                    Toast.makeText(MainActivity.this, "Pausado", Toast.LENGTH_SHORT).show();

                }
                else{
                    mp.start();
                    btnReproducir.setBackgroundResource(R.drawable.img01);

                }
            }
        });
    }
}