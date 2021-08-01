package com.example.examing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.examing.databinding.ActivitySplashScreenBinding;

public class SplashScreenActivity extends AppCompatActivity {

    private ActivitySplashScreenBinding binding;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_splash_screen);

        animation = AnimationUtils.loadAnimation(this, R.anim.anim_to_txt);
        binding.title.setAnimation(animation);
        binding.subTitle.setAnimation(animation);

        animation = AnimationUtils.loadAnimation(this, R.anim.anim_to_img);
        binding.logo.setAnimation(animation);

        animation = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        binding.login.setAnimation(animation);
        binding.register.setAnimation(animation);
    }
}