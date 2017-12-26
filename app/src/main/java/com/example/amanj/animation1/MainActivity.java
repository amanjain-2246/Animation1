package com.example.amanj.animation1;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.CycleInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
AnimationDrawable monkeyAnimation;
    ImageView imageView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView)findViewById(R.id.imageView);
        button=(Button)findViewById(R.id.button);


        if(imageView==null)throw new AssertionError();
        imageView.setVisibility(View.INVISIBLE);
        imageView.setBackgroundResource(R.drawable.monkey_animation);
        monkeyAnimation=(AnimationDrawable)imageView.getBackground();
        monkeyAnimation.setOneShot(true);

       button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    imageView.setVisibility(View.VISIBLE);
                    if (monkeyAnimation.isRunning()) {
                        monkeyAnimation.stop();
                    }
                    monkeyAnimation.start();
                   imageView.clearAnimation();
//                imageView.setBackgroundResource(R.drawable.monkey_animation);
//                monkeyAnimation=(AnimationDrawable)imageView.getBackground();
//                monkeyAnimation.setOneShot(true);
//                if (monkeyAnimation.isRunning()) {
//                    monkeyAnimation.stop();
//                }monkeyAnimation.start();


            }
        });














    /*button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.myanim);
            animation.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {

                }

                @Override
                public void onAnimationEnd(Animation animation) {
                //imageView.startAnimation(animation);
 imageView.animate().scaleX(-2).scaleY(-2).rotationX(-360).rotationY(-360).translationX(-200).translationY(-200).setDuration(3000);


                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }
            });

                imageView.startAnimation(animation);

        }


    });
*/
/*
       button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.animate().scaleX(2).scaleY(2).rotationX(360).rotationY(360).translationX(200).translationY(200).setDuration(3000).setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        Log.i("onstart","startcalled");
                        imageView.animate().scaleX(2).scaleY(2).rotationX(360).rotationY(360).translationX(200).translationY(200).setDuration(3000);

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        Log.i("onend","endcalled");
                   //imageView.clearAnimation();
                     //   imageView.animate().scaleX(-2).scaleY(-2).rotationX(-360).rotationY(-360).translationX(-200).translationY(-200).setDuration(3000);
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                       // imageView.animate().scaleX(2).scaleY(2).rotationX(360).rotationY(360).translationX(200).translationY(200).setDuration(3000);

                    }
                });


            }
        });
*/
    }





}
