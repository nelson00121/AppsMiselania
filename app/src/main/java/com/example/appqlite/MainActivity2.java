package com.example.appqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText edtCodigo,edtCurso,edtCarrera;
    Button btnAgregar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edtCodigo =(EditText)findViewById(R.id.edtCodigo);
        edtCurso =(EditText)findViewById(R.id.edtCurso);
        edtCarrera =(EditText)findViewById(R.id.edtCarrera);
        btnAgregar=(Button) findViewById(R.id.btnAgregar);

        //creamos una instancia de la clase que contiene la base de datos
        // para poder hacer uso de los métodos que en ella se conforman
        final BaseDB baseDB = new BaseDB(getApplicationContext());

        //Creamos el evento el cual va a poder guardar los datos, esto está conectado con el boton
        btnAgregar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                baseDB.agregarApp(edtCodigo.getText().toString(),edtCurso.getText().toString(),edtCarrera.getText().toString());
                Toast.makeText(getApplicationContext(), "Se agregó Datos",Toast.LENGTH_SHORT).show();
            }
        });
    }

}