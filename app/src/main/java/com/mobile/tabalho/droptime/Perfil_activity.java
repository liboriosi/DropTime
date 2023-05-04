package com.mobile.tabalho.droptime;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		my_account_screen
	 *	@date 		Thursday 27th of April 2023 01:34:31 AM
	 *	@title 		APP
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	
	

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

public class Perfil_activity extends Activity {

	
	private View _bg__my_account_screen;
	private Button btmensagem;
	private Button btminhaconta;

	private Button bthome;
	private Button btpedido;
	private Button btdados;
	private Button btsair;
	private Button btmeuspedidos;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_perfil);

		btpedido = (Button) findViewById(R.id.icon_cart);
		bthome = (Button) findViewById(R.id.icon_pizza);
		btminhaconta = (Button) findViewById(R.id.icon_profile);
		btdados = (Button) findViewById(R.id.buttonPerfilDadosPessoais);
		btmensagem = (Button) findViewById(R.id.buttonPerfilMensagens);
		btsair = (Button) findViewById(R.id.buttonPerfilSair);
		btmeuspedidos = (Button) findViewById(R.id.buttonPerfilPedidos);

		
		btmensagem.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), Mensagens_activity.class);
				startActivity(nextScreen);
			
		
			}
		});

		btpedido.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), Pedidos_activity.class);
				startActivity(nextScreen);


			}
		});
		btminhaconta.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), Perfil_activity.class);
				startActivity(nextScreen);


			}
		});
		bthome.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), tela_inicial_activity.class);
				startActivity(nextScreen);


			}
		});
		btdados.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), DadosUsuarioActivity.class);
				startActivity(nextScreen);


			}
		});
		btsair.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), LoginActivity.class);
				startActivity(nextScreen);


			}
		});
		btmeuspedidos.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), Pedidos_activity.class);
				startActivity(nextScreen);


			}
		});


		//custom code goes here
	
	}
}
	
	