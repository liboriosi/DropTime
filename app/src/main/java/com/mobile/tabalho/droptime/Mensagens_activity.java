package com.mobile.tabalho.droptime;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		fragment_mensagens
	 *	@date 		Thursday 27th of April 2023 12:14:32 AM
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

public class Mensagens_activity extends Activity {

	
	private View _bg__message_screen;
	private View rectangle;
	private ImageView vector;
	private ImageView _exclude;
	private TextView mensagens;
	private View rectangle_161_ek1;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private ImageView vector_ek4;
	private View rectangle_159;
	private View rectangle_155;
	private TextView seu_pedido_est__pronto____;
	private TextView seu_pedido_j__pode_ser_retirado_na_recep__o_do_estabelecimento;
	private TextView __0001;
	private TextView n_do_pedido_;
	private View line_16;
	private TextView h__2_min_;
	private View rectangle_156;
	private ImageView vector_ek5;
	private ImageView vector_ek6;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_mensagens);

		
//		_bg__message_screen = (View) findViewById(R.id._bg__message_screen);
		mensagens = (TextView) findViewById(R.id.TextViewMensagens);
		seu_pedido_est__pronto____ = (TextView) findViewById(R.id.seu_pedido_est__pronto____);
		seu_pedido_j__pode_ser_retirado_na_recep__o_do_estabelecimento = (TextView) findViewById(R.id.seu_pedido_j__pode_ser_retirado_na_recep__o_do_estabelecimento);
		__0001 = (TextView) findViewById(R.id.__0001);
		n_do_pedido_ = (TextView) findViewById(R.id.n_do_pedido_);

	
		
		_exclude.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), homescreen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	