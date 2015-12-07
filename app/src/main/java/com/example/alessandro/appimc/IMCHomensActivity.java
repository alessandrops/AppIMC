package com.example.alessandro.appimc;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IMCHomensActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imchomens);
        final EditText pHomens = (EditText) findViewById(R.id.PesoHomen);
        final EditText aHomens = (EditText) findViewById(R.id.AlturaHomen);
        Button calcularIMC = (Button) findViewById(R.id.IMCHomen);
        final AlertDialog.Builder dialogo = new AlertDialog.Builder(IMCHomensActivity.this);
        dialogo.setTitle("Resultado");
        dialogo.setNeutralButton("OK", null);
        calcularIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double PesoH = Double.parseDouble(pHomens.getText().toString());
                double AlturaH = Double.parseDouble(aHomens.getText().toString());
                double resultado = PesoH / (AlturaH * AlturaH);
                if (resultado < 20.7) {
                    dialogo.setMessage(Math.floor(resultado) + " - Magrinho, pau de vira tripa");
                    dialogo.show();
                } else if (resultado >= 20.7 && resultado <= 26.4) {
                    dialogo.setMessage(Math.floor(resultado) + " - Ta Top!!!");
                    dialogo.show();
                } else if (resultado >= 26.4 && resultado <= 27.8) {
                    dialogo.setMessage(Math.floor(resultado) + " - Vamo pra academia");
                    dialogo.show();
                } else if (resultado >= 27.8 && resultado <= 31.1) {
                    dialogo.setMessage(Math.floor(resultado) + " - bala de canhão");
                    dialogo.show();
                } else if (resultado > 31.1) {
                    dialogo.setMessage(Math.floor(resultado) + " - Obeso, rolha de poço");
                    dialogo.show();
                }

            }
        });
    }
}
