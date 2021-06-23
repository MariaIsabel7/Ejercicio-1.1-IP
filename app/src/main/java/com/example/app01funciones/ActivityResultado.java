package com.example.app01funciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class ActivityResultado extends AppCompatActivity {

    EditText resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

      resultado();
    }

    private void resultado() {
        Intent intent = getIntent();
        Bundle resp = getIntent().getExtras();
        int datos = (int) resp.get("Resultado");

        resultado = (EditText) findViewById(R.id.txt_resultado);
        resultado.setText(""+datos);

    }

}