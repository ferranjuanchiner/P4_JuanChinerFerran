package com.example.P4_JuanChinerFerran;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.graphics.drawable.AnimationDrawable;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable TitleAnimation;
    MediaPlayer media;
    ImageView imgDonut;
    int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        contador = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView TitleImage = (ImageView) findViewById(R.id.animacioImg);
        imgDonut = findViewById(R.id.imageView_donut);
        TitleAnimation = (AnimationDrawable) TitleImage.getDrawable();;
                TitleAnimation.start();
        TitleImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView donut = (ImageView) findViewById(R.id.imageView_donut);
                ImageView ull = (ImageView) findViewById(R.id.imageView_ull);
                ImageView evermell = (ImageView) findViewById(R.id.imageView_engranatgeRED);
                ImageView everd = (ImageView) findViewById(R.id.imageView_engranatgeGREEN);
                ImageView eblau = (ImageView) findViewById(R.id.imageView6_engranatgeBLUE);
                if (contador%2==0){
                donut.setVisibility(View.VISIBLE);
                    Animation animDonut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animacio_donut);
                    donut.startAnimation(animDonut);
                    ull.setVisibility(View.VISIBLE);
                    Animation animUll = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animacio_ull);
                    ull.startAnimation(animUll);
                    evermell.setVisibility(View.VISIBLE);
                    Animation animEvermell = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animacio_evermell);
                    evermell.startAnimation(animEvermell);
                    everd.setVisibility(View.VISIBLE);
                    Animation animEverd = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animacio_everd);
                    everd.startAnimation(animEverd);
                    eblau.setVisibility(View.VISIBLE);
                    Animation animEblau = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animacio_eblau);
                    eblau.startAnimation(animEblau);
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
            }}); }}




