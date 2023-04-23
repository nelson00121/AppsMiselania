package com.example.conversorgrados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText cel,far;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.cel = (EditText) findViewById(R.id.textConversorC);
        this.far = (EditText) findViewById(R.id.textConversorF);

        //Escuchar
        this.cel.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                //Calculo
                float gradoFaren;
                gradoFaren = (1.8f)*Float.parseFloat(cel.getText().toString())+32;
                far.setText("" + gradoFaren);
                return false;
            }
        });
        this.far.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                //Calculo
                float gradoCell;
                gradoCell = (Float.parseFloat(far.getText().toString())-32)/(1.8f);
                        cel.setText("" + gradoCell );

                return false;
            }
        });
    }
}