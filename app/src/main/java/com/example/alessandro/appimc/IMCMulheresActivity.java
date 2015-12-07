package com.example.alessandro.appimc;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IMCMulheresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcmulheres);
        final EditText pMulher = (EditText) findViewById(R.id.PesoMulher);
        final EditText aMulher = (EditText) findViewById(R.id.AlturaMulher);
        Button calcularIMC = (Button) findViewById(R.id.IMCMulher);
        final AlertDialog.Builder dialogo = new AlertDialog.Builder(IMCMulheresActivity.this);
        dialogo.setTitle("Resultado");
        dialogo.setNeutralButton("OK", null);
        calcularIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               double PesoM = Double.parseDouble(pMulher.getText().toString());
                double AlturaM = Double.parseDouble(aMulher.getText().toString());
                double resultado = PesoM / (AlturaM*AlturaM);
                if (resultado < 19.1) {
                    dialogo.setMessage(Math.floor(resultado) + " - Magricela demais, vai comer caralho");
                    dialogo.show();
                }else if (resultado>=19.1 && resultado<=25.8){
                    dialogo.setMessage(Math.floor(resultado) + " - Ta Top!!!");
                    dialogo.show();
                }else if (resultado>=25.8 && resultado<= 27.3){
                    dialogo.setMessage(Math.floor(resultado) + " - Vamo pra academia");
                    dialogo.show();
                }else if (resultado>=27.3 && resultado<=32.3){
                    dialogo.setMessage(Math.floor(resultado) + " - Ta gorda, baleia, vaca");
                    dialogo.show();
                }else if (resultado>32.3){
                    dialogo.setMessage(Math.floor(resultado) + " - Obesaaa, rolha de poço");
                    dialogo.show();
                }

            }
        });
    }
}
