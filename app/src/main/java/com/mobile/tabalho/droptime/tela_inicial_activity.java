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
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

public class tela_inicial_activity extends Activity {

	
	private View _bg__home_screen;
	private TextView tamanho_das_pizzas;
	private View rectangle_155;
	private ImageView _vector;
	private ImageView vector_ek1;
	private View rectangle_152;
	private View rectangle_153;
	private ImageView pexels_rene_strgar_13814644_1;
	private TextView grande;
	private TextView pizza_ek1;
	private TextView _12_peda_os;
	private TextView _35cm;
	private TextView _3_sabores;
	private View rectangle_154;
	private TextView r__65_00;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private ImageView vector_ek4;
	private ImageView vector_ek5;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_inicial);


	
		
		_vector.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), Mensagens_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	