package com.example.appnumeroprimo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText numero;
    private Button operar;
    private TextView Resultado;

    AlertDialog.Builder dia;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero = (EditText)findViewById(R.id.txtnumero);
        operar = (Button) findViewById(R.id.btnCalcular);
        Resultado = (TextView) findViewById(R.id.txtResultado);

        operar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num = Integer.parseInt(numero.getText().toString());
                int a = 0;
                for(int i = 1; i <= num; i ++){
                    if (num % i ==0){
                        a++;
                    }

                }
                if(a ==2){
                    Resultado.setText("El número es primo: ");
                }
                else {
                    Resultado.setText("El numero No es primo");
                }


            }
        });
    }
}