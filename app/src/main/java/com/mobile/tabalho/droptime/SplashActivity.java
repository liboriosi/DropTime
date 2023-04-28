package com.mobile.tabalho.droptime;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_splash);

        // Aguarda 2 segundos antes de chamar a próxima tela
        /*new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Cria uma nova Intent para a próxima tela
                Intent nextScreen = new Intent(SplashActivity.this, LoginFragment.class);
                startActivity(nextScreen);

                // Finaliza a atividade atual
                finish();
            }
        }, 2000);*/
    }


}
