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
public class EsqueceuSenhaActivity extends Activity {

    private Button btacessar;
    public EsqueceuSenhaActivity() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_esqueceu_senha);

        btacessar = (Button) findViewById(R.id.esqueceuSenhaButtonAcessar);

        btacessar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent nextScreen = new Intent(EsqueceuSenhaActivity.this, LoginActivity.class);
                startActivity(nextScreen);


            }
        });
    }


}