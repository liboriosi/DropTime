package com.mobile.tabalho.droptime;

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
public class LoginFragment extends Fragment {

    private Button btacessar;
    private Button btcadastrar;
    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        btacessar = (Button) container.findViewById(R.id.loginButtonAcessar);
        btcadastrar = (Button) container.findViewById(R.id.loginButtonCadastrar);


        btacessar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent nextScreen = new Intent(getActivity(), tela_carrinho_activity.class);
                startActivity(nextScreen);


            }
        });
        btcadastrar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent nextScreen = new Intent(getActivity(), CadastroFragment.class);
                startActivity(nextScreen);


            }
        });

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }
}