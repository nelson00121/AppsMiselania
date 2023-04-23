package com.example.appcifrado;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText entrada;
    TextView resultado;
    Button convertir;

   private final String abc = new String("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ");

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrada = (EditText) findViewById(R.id.tventrada);
        resultado = (TextView) findViewById(R.id.txtresultado);
        convertir = (Button) findViewById(R.id.btnCodificar);
    }
    public  void Cifrador(){
        
    }
}