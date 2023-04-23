package com.example.appordenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private EditText pedidoss;
    private Button Operar;
    private TextView Resultado;
    int numero_menor;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pedidoss = (EditText) findViewById(R.id.txtpedido);
        Operar = (Button) findViewById(R.id.btnCalcular);
        Resultado =(TextView) findViewById(R.id.txtResultado);

        Operar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int pedir = Integer.parseInt(pedidoss.getText().toString());
                int[] arreglo = new int[pedir];
                for(int i = 0; i < pedir; i++){
                    numero_menor = arreglo[0];
                    if(arreglo[i] < numero_menor){
                        numero_menor =arreglo[i];
                    }
                    else{
                        if(arreglo[i] > numero_menor){
                            numero_menor = numero_menor;
                        }
                    }

                }
                Resultado.setText("El orden es: " + numero_menor);


            }
        });

    }
}