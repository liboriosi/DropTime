package com.mobile.tabalho.droptime;

	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		cart_screen
	 *	@date 		Sunday 23rd of April 2023 09:04:15 PM
	 *	@title 		APP
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class tela_carrinho_activity extends Activity {

	
	private View _bg__cart_screen;
	private View bg;
	private Button btminhaconta;

	private Button bthome;
	private Button btpedido;
	private Button btconfirmar;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_carrinho);


		btpedido = (Button) findViewById(R.id.icon_cart);
		bthome = (Button) findViewById(R.id.icon_pizza);
		btminhaconta = (Button) findViewById(R.id.icon_profile);
		btconfirmar = (Button) findViewById(R.id.buttonCarrinhoConfirmar);

		
		//custom code goes here
		btpedido.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(tela_carrinho_activity.this, Pedidos_activity.class);
				startActivity(nextScreen);


			}
		});
		btminhaconta.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(tela_carrinho_activity.this, Perfil_activity.class);
				startActivity(nextScreen);


			}
		});
		bthome.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(tela_carrinho_activity.this, tela_inicial_activity.class);
				startActivity(nextScreen);


			}
		});
		btconfirmar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(tela_carrinho_activity.this, tela_confirmar_activity.class);
				startActivity(nextScreen);


			}
		});
	
	}
}
	
	