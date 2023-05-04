package com.mobile.tabalho.droptime;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		home_screen
	 *	@date 		Wednesday 19th of April 2023 11:46:51 AM
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

public class tela_inicial_activity extends Activity {

	private Button btselecionar;
	private Button btminhaconta;
	private Button btpedido;
	private Button bthome;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_inicial);

		btpedido = (Button) findViewById(R.id.icon_cart);
		bthome = (Button) findViewById(R.id.icon_pizza);
		btminhaconta = (Button) findViewById(R.id.icon_profile);





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

		btselecionar = (Button) findViewById(R.id.selecionar);
	
		
		btselecionar.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(tela_inicial_activity.this, tela_sabores_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	