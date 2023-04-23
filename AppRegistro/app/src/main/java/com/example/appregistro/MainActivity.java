package com.example.appregistro;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText edtDpi,edtNombre,edtDireccion,edtTelefono;
    Button btnGuardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtDpi=(EditText)findViewById(R.id.edtDpi);
        edtNombre=(EditText)findViewById(R.id.edtNombre);
        edtDireccion=(EditText) findViewById(R.id.edtDireccion);
        edtTelefono=(EditText) findViewById(R.id.edtTelefono);
        btnGuardar=(Button) findViewById(R.id.btnGuardar);

        final Registro registro = new Registro(getApplicationContext());
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registro.Agregar(edtDpi.getText().toString(),edtNombre.getText().toString(),edtDireccion.getText().toString(),edtTelefono.getText().toString());
                Toast.makeText(getApplicationContext(), "Se agregó", Toast.LENGTH_LONG).show();
            }
        });
    }
}