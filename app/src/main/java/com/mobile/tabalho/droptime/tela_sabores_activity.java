package com.mobile.tabalho.droptime;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class tela_sabores_activity extends Activity {

	private ImageView btselecionarsabor;
	private Button bthome;
	private Button btminhaconta;
	private Button btpedido;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_sabores);

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

		
		btselecionarsabor = (ImageView) findViewById(R.id.X);

		btselecionarsabor.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), tela_carrinho_activity.class);
				startActivity(nextScreen);


			}
		});
		//custom code goes here
	
	}
}
	
	