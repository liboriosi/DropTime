package com.mobile.tabalho.droptime;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class CadastroActivity extends Activity {

    private Button btcadastrar;

    public CadastroActivity() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_cadastro);


        btcadastrar = (Button) findViewById(R.id.cadastroButtonAcessar);
        btcadastrar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent nextScreen = new Intent(CadastroActivity.this, Perfil_activity.class);
                startActivity(nextScreen);


            }
        });

    }


}