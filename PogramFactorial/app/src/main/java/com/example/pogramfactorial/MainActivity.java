package com.example.pogramfactorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ingresoNumero;
    private TextView numeroresul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingresoNumero =(EditText) findViewById(R.id.textFactorialNumero);
        numeroresul = (TextView) findViewById(R.id.txtResultado);
    }
    public int calculofacto(int numero) {
        int aux = 1;
        for(int i = 2; i<=numero;i++) {
            aux = aux * i;
        }
            return aux;
    }
    public int factorialII(int num) {
        if (num == 0) {
            return 1;

        } else {
            return num * factorialII(num - 1);
        }

    }
        public void clickfactorial(View view){
        String valor2 = ingresoNumero.getText().toString();
         int num = Integer.parseInt(valor2);
        numeroresul.setText("El factorial es: " + calculofacto(num));
        }
}