package com.mobile.tabalho.droptime;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		name_screen
	 *	@date 		Wednesday 26th of April 2023 11:35:50 AM
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

public class tela_confirmar_activity extends Activity {

	private Button btpedido;
	private Button bthome;
	private Button btminhaconta;

	private Button btpag1;
	private Button btpag2;
	private Button btpag3;




	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_confirmar);


		btpedido = (Button) findViewById(R.id.icon_cart);
		bthome = (Button) findViewById(R.id.icon_pizza);
		btminhaconta = (Button) findViewById(R.id.icon_profile);
		btpag1 = (Button) findViewById(R.id.metodos_de_pagamento_1);
		btpag2	 = (Button) findViewById(R.id.metodos_de_pagamento_2);
		btpag3 = (Button) findViewById(R.id.metodos_de_pagamento_3);






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
		btpag1.setOnClickListener(new View.OnClickListener() {

				public void onClick(View v) {

					Intent nextScreen = new Intent(getApplicationContext(), Pedidos_activity.class);
					startActivity(nextScreen);


				}
			});
		btpag2.setOnClickListener(new View.OnClickListener() {

				public void onClick(View v) {

					Intent nextScreen = new Intent(getApplicationContext(), Pedidos_activity.class);
					startActivity(nextScreen);


				}
			});
		btpag3.setOnClickListener(new View.OnClickListener() {

				public void onClick(View v) {

					Intent nextScreen = new Intent(getApplicationContext(), Pedidos_activity.class);
					startActivity(nextScreen);


				}
			});


		
		//custom code goes here
	
	}
}
	
	