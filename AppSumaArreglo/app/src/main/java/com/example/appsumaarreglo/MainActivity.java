package com.example.appsumaarreglo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private EditText R1;
    private TextView Resultado;
    int pedido;
    int suma = 0;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        R1 = (EditText) findViewById(R.id.textArreglo);
        Resultado = (TextView) findViewById(R.id.txtResultado);
    }
public void ClickArreglo (View view){
    pedido = R1.getText().toString().length();
    int[] arreglo = new int[pedido];
    for(int i = 0; i <=arreglo.length;i++){
        arreglo[i]= R1.getText().length();
        suma+=arreglo[i];
    }

}

}