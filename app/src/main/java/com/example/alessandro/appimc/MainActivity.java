package com.example.alessandro.appimc;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMulheres;
    Button btnHomens;
    Button btnOutros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMulheres = (Button) findViewById(R.id.BTNMulheres);
        btnHomens = (Button) findViewById(R.id.BTNHomens);
        btnOutros = (Button) findViewById(R.id.BTNoutro);

        btnMulheres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMulheres = new Intent();
                intentMulheres.setClass(MainActivity.this, IMCMulheresActivity.class);
                startActivity(intentMulheres);
            }
        });
        btnHomens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomens = new Intent();
                intentHomens.setClass(MainActivity.this, IMCHomensActivity.class);
                startActivity(intentHomens);
            }
        });
        btnOutros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle( "WTF");
                dialogo.setMessage("Que outro ???");
                dialogo.show();

            }
        });
    }
}
