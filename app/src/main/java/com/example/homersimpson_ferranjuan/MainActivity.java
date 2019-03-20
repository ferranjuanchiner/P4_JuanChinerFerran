package com.example.homersimpson_ferranjuan;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.graphics.drawable.AnimationDrawable;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable TitleAnimation;
    MediaPlayer media;
    int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        contador = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView TitleImage = (ImageView) findViewById(R.id.animacioImg);
        TitleAnimation = (AnimationDrawable) TitleImage.getDrawable();;
                TitleAnimation.start();
        TitleImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //obté l'animació anomenada animacio.xml que es troba en la carpeta drawable
                ImageView donut = (ImageView) findViewById(R.id.imageView2);
                ImageView ull = (ImageView) findViewById(R.id.imageView3);
                ImageView evermell = (ImageView) findViewById(R.id.imageView4);
                ImageView everd = (ImageView) findViewById(R.id.imageView5);
                ImageView eblau = (ImageView) findViewById(R.id.imageView6);
                if (contador%2==0){
                donut.setVisibility(View.VISIBLE);
                    ull.setVisibility(View.VISIBLE);
                    evermell.setVisibility(View.VISIBLE);
                    everd.setVisibility(View.VISIBLE);
                    eblau.setVisibility(View.VISIBLE);
                    donut.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try
                            {
                                if (media != null && media.isPlaying())
                                {

                                    media.stop();
                                }
                                else
                                {
                                    media = MediaPlayer.create(getApplicationContext(), R.raw.the_simpsons);
                                    media.start();
                                }
                            } catch(Exception e) {

                            }
                        }
                });}
                else {
                    donut.setVisibility(View.INVISIBLE);
                    ull.setVisibility(View.INVISIBLE);
                    evermell.setVisibility(View.INVISIBLE);
                    everd.setVisibility(View.INVISIBLE);
                    eblau.setVisibility(View.INVISIBLE);
                }
                contador++;
            }})

        ;}

        }


