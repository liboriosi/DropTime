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
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;

public class Pedidos_activity extends Activity {

	
	private View _bg__my_requests_screen;
	private View rectangle;
	private ImageView vector;
	private ImageView _exclude;
	private TextView meus_pedidos;
	private View rectangle_160;
	private View rectangle_156;
	private TextView n_do_pedido_;
	private TextView __0001;
	private TextView r__65_00;
	private ImageView pexels_rene_strgar_13814644_2;
	private TextView pizza_grande;
	private TextView _35cm___12_peda_os;
	private TextView sabor_1___sabor_2___sabor_3;
	private TextView status_do_pedido__finalizado;
	private View rectangle_161_ek1;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private View rectangle_156_ek1;
	private ImageView vector_ek4;
	private ImageView _vector_ek5;
	private ImageView vector_ek6;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_pedidos);

		

		meus_pedidos = (TextView) findViewById(R.id.meus_pedidos);

		n_do_pedido_ = (TextView) findViewById(R.id.n_do_pedido_);
		__0001 = (TextView) findViewById(R.id.__0001);
		r__65_00 = (TextView) findViewById(R.id.r__65_00);
		pexels_rene_strgar_13814644_2 = (ImageView) findViewById(R.id.pexels_rene_strgar_13814644_2);
		pizza_grande = (TextView) findViewById(R.id.pizza_grande);
		_35cm___12_peda_os = (TextView) findViewById(R.id._35cm___12_peda_os);
		sabor_1___sabor_2___sabor_3 = (TextView) findViewById(R.id.sabor_1___sabor_2___sabor_3);
		status_do_pedido__finalizado = (TextView) findViewById(R.id.status_do_pedido__finalizado);

	
		
		_exclude.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), exportkit.figma.home_screen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		

		
		
		//custom code goes here
	
	}
}
	
	