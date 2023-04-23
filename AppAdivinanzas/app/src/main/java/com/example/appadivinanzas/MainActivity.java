package com.example.appadivinanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText entrada;
    TextView salida;
    Button advinar;

    int contador = 0;
    int pedir;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrada = (EditText) findViewById(R.id.tventrada);
        salida = (TextView) findViewById(R.id.txtresultado);
        advinar = (Button) findViewById(R.id.tnAdivinar);

        advinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random aleator = new Random();
               int aleatorio = aleator.nextInt(100);
               salida.setText(Integer.toString(aleatorio));

               do {
                    pedir = Integer.parseInt(entrada.getText().toString());
                    if(aleatorio > pedir){
                        Toast.makeText(MainActivity.this, "Digita un numero Mayor", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Digita un numero Menor", Toast.LENGTH_SHORT).show();
                    }
                    contador ++;

               }while (pedir !=  aleatorio);
               salida.setText("Los has advinidado"+ contador + "Intentos");

            }
        });
    }
}