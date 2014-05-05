package com.example.kwod;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity{
	private Button dodajZdarzenie;
	private Button faktyMity;
	private Button konfiguruj;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //============================================================
        dodajZdarzenie = (Button) findViewById(R.id.dodaj_zdarzenieB);
        dodajZdarzenie.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MenuActivity.this, DodajZdarzenieActivity.class);
				startActivity(intent);
			}
		});
        //============================================================
        faktyMity = (Button) findViewById(R.id.fakty_mityB);
        faktyMity.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MenuActivity.this, FaktyMityActivity.class);
				startActivity(intent);
			}
		});
        //============================================================
        konfiguruj = (Button) findViewById(R.id.konfiguracjaB);
        konfiguruj.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MenuActivity.this, KonfigurujActivity.class);
				startActivity(intent);
			}   
        });
	}
	
}
