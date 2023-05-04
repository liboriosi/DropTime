package com.mobile.tabalho.droptime;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		my_requests_screen
	 *	@date 		Thursday 27th of April 2023 01:14:03 AM
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
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;

public class Pedidos_activity extends Activity {

	
	private View _bg__my_requests_screen;
	private View rectangle;
	private ImageView vector;
	private ImageView _exclude;
	private Button btminhaconta;

	private Button bthome;
	private Button btpedido;
	private TextView meus_pedidos;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_pedidos);

		

		btpedido = (Button) findViewById(R.id.icon_cart);
		bthome = (Button) findViewById(R.id.icon_pizza);
		btminhaconta = (Button) findViewById(R.id.icon_profile);

		meus_pedidos = (TextView) findViewById(R.id.meus_pedidos);


		btpedido.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(Pedidos_activity.this, Pedidos_activity.class);
				startActivity(nextScreen);


			}
		});
		btminhaconta.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(Pedidos_activity.this, Perfil_activity.class);
				startActivity(nextScreen);


			}
		});
		bthome.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(Pedidos_activity.this, tela_inicial_activity.class);
				startActivity(nextScreen);


			}
		});

		
		
		//custom code goes here
	
	}
}
	
	