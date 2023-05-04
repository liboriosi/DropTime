package com.mobile.tabalho.droptime;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class LoginActivity extends Activity {

    private Button btacessar;
    private Button btcadastrar;
    private TextView btesqueceusenha;


    public LoginActivity() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);

        btacessar = (Button) findViewById(R.id.loginButtonAcessar);
        btcadastrar = (Button) findViewById(R.id.loginButtonCadastrar);
        btesqueceusenha = (TextView) findViewById(R.id.textViewLoginEsqueceuSenha);
        btacessar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent nextScreen = new Intent(LoginActivity.this, tela_inicial_activity.class);
                startActivity(nextScreen);


            }
        });
        btcadastrar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent nextScreen = new Intent(LoginActivity.this, CadastroActivity.class);
                startActivity(nextScreen);


            }
        });
        btesqueceusenha.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent nextScreen = new Intent(LoginActivity.this, EsqueceuSenhaActivity.class);
                startActivity(nextScreen);


            }
        });


    }


}