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
	private View rectangle;
	private ImageView vector;
	private ImageView exclude;
	private View rectangle_156;
	private ImageView vector_ek1;
	private ImageView _vector_ek2;
	private View rectangle_160;
	private ImageView ellipse_6;
	private TextView henrique_zimermann;
	private TextView henriquezimermann_edu_univali_br;
	private View rectangle_161_ek1;
	private ImageView vector_ek3;
	private ImageView vector_ek4;
	private ImageView vector_ek5;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_perfil);

		
	
		btminhaconta = (Button) findViewById(R.id.buttonDadosPessoais);
		btmensagem = (Button) findViewById(R.id.buttonMensagens);
		ellipse_6 = (ImageView) findViewById(R.id.ellipse_6);
		henrique_zimermann = (TextView) findViewById(R.id.henrique_zimermann);
		henriquezimermann_edu_univali_br = (TextView) findViewById(R.id.henriquezimermann_edu_univali_br);
	
		
		btmensagem.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), Mensagens_activity.class);
				startActivity(nextScreen);
			
		
			}
		});

		btminhaconta.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), Perfil_activity.class);
				startActivity(nextScreen);


			}
		});
		
		//custom code goes here
	
	}
}
	
	