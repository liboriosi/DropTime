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

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_sabores);

		
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
	
	