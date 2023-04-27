package com.mobile.tabalho.droptime;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		name_screen
	 *	@date 		Tuesday 18th of April 2023 11:21:55 PM
	 *	@title 		APP
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	



import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;


	public class tela_escolha_activity extends Activity {


		private View rectangle_156;
	private ImageView _vector;
	private ImageView vector_ek1;
	private TextView m_todos_de_pagamento_;
	private View rectangle_155;
	private TextView cart_o_de_credito;
	private ImageView unfilled_ek2;
	private View rectangle_154;
	private TextView cart_o_de_d_bito;
		private ImageView unfilled_ek4;
	private ImageView vector_ek2;

	@SuppressLint("MissingInflatedId")
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_escolha);


	
		
		_vector.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), Mensagens_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		

	
	}
}
	
	