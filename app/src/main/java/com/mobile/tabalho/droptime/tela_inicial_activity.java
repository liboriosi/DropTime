
	 
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
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

public class home_screen_activity extends Activity {

	
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
		setContentView(R.layout.home_screen);

		
		_bg__home_screen = (View) findViewById(R.id._bg__home_screen);
		tamanho_das_pizzas = (TextView) findViewById(R.id.tamanho_das_pizzas);
		rectangle_155 = (View) findViewById(R.id.rectangle_155);
		_vector = (ImageView) findViewById(R.id._vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		rectangle_152 = (View) findViewById(R.id.rectangle_152);
		rectangle_153 = (View) findViewById(R.id.rectangle_153);
		pexels_rene_strgar_13814644_1 = (ImageView) findViewById(R.id.pexels_rene_strgar_13814644_1);
		grande = (TextView) findViewById(R.id.grande);
		pizza_ek1 = (TextView) findViewById(R.id.pizza_ek1);
		_12_peda_os = (TextView) findViewById(R.id._12_peda_os);
		_35cm = (TextView) findViewById(R.id._35cm);
		_3_sabores = (TextView) findViewById(R.id._3_sabores);
		rectangle_154 = (View) findViewById(R.id.rectangle_154);
		r__65_00 = (TextView) findViewById(R.id.r__65_00);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
	
		
		_vector.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), message_screen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	