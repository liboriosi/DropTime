package com.example.droptime;

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


	public class name_screen_activity extends Activity {


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
		setContentView(R.layout.name_screen);


		View _bg__name_screen = (View) findViewById(R.id._bg__name_screen);
		TextView pagamento = (TextView) findViewById(R.id.pagamento);
		ImageView unfilled_ek1 = (ImageView) findViewById(R.id.unfilled_ek1);
		rectangle_156 = (View) findViewById(R.id.rectangle_156);
		_vector = (ImageView) findViewById(R.id._vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		m_todos_de_pagamento_ = (TextView) findViewById(R.id.m_todos_de_pagamento_);
		rectangle_155 = (View) findViewById(R.id.rectangle_155);
		cart_o_de_credito = (TextView) findViewById(R.id.cart_o_de_credito);
		unfilled_ek2 = (ImageView) findViewById(R.id.unfilled_ek2);
		rectangle_154 = (View) findViewById(R.id.rectangle_154);
		cart_o_de_d_bito = (TextView) findViewById(R.id.cart_o_de_d_bito);
		ImageView unfilled_ek3 = (ImageView) findViewById(R.id.unfilled_ek3);
		View rectangle_155_ek1 = (View) findViewById(R.id.rectangle_155_ek1);
		TextView pix = (TextView) findViewById(R.id.pix);
		unfilled_ek4 = (ImageView) findViewById(R.id.unfilled_ek4);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
	
		
		_vector.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), message_screen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		

	
	}
}
	
	