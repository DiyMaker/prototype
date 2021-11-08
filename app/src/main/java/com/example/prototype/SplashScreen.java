package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        openApp(true);
        //
        ImageView imagen;
        imagen =(ImageView) findViewById(R.id.logo1);

        Animation fadein = AnimationUtils.loadAnimation(
                this,R.anim.fadein
        );
        imagen.startAnimation(fadein);
    }
    public void openApp ( boolean locationPermission){
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent(SplashScreen .this, Login.class);
                startActivity(intent);
            }
        },3550);
    }
}