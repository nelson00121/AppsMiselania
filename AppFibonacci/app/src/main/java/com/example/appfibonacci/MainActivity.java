package com.example.appfibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edic;
    Button operar;
    TextView mostrar;
    String validar;
    public int i;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edic = (EditText) findViewById(R.id.txtFibo);
        operar = (Button) findViewById(R.id.btnCalculoFibo);
        mostrar = (TextView) findViewById(R.id.txtResultado);

        operar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edic.getText().toString() == ""){
                   mostrar.setText("Campo vacio");
                }
                mostrar.setText(fibo(Integer.parseInt(edic.getText().toString())));

            }
        });
    }

    private String fibo(int n) {

            String text = "";
            ArrayList<BigInteger> fibo = new ArrayList<>();
            BigInteger primero = new BigInteger("0");
            BigInteger segundo = new BigInteger("1");
            fibo.add(primero);
            fibo.add(segundo);

            for ( i = 1; i < n; i++) {
                fibo.add(fibo.get(i).add(fibo.get(i - 1)));
            }
            for (int x = 1; x <= n; x++) {
                text = text  + x  + "+" + fibo.get(x) + "\n" ;
            }

            return text;
        }

    }



