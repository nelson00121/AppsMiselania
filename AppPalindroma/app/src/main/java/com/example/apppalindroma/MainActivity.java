package com.example.apppalindroma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.ObjectInputValidation;
import java.util.Locale;

import javax.xml.validation.Validator;

public class MainActivity extends AppCompatActivity {

   private  EditText textConversorPalabra ;
    private TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResultado = findViewById(R.id.txtResultado);
        textConversorPalabra = findViewById(R.id.textConversorPalabra);

    }
    public void ValidarPalabra(View view){
        char[] entrada = textConversorPalabra.getText().toString().toCharArray();
        int tamaño = entrada.length;

        boolean palindroma = true;

        for(int i = 0; i<tamaño/2; i++){
            if(entrada[i] != entrada[tamaño -1-i]){
                palindroma = false;
                break;
            }
        }
        if(palindroma){
            txtResultado.setText("Es Palindroma");
        }
        else{
            txtResultado.setText("No Es Palindroma");
        }
    }
}