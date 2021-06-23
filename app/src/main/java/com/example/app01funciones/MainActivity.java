package com.example.app01funciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    EditText numero1, numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_suma = (Button) findViewById(R.id.btn_suma);
        Button btn_resta = (Button) findViewById(R.id.btn_resta);
        Button btn_div = (Button) findViewById(R.id.btn_division);
        Button btn_mult = (Button) findViewById(R.id.btn_multiplicacion);

        EditText numero1 = (EditText) findViewById(R.id.txt_n1);
        EditText numero2 = (EditText) findViewById(R.id.txt_n2);




        btn_suma.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int num1 = Integer.parseInt(numero1.getText().toString());
            int num2 = Integer.parseInt(numero2.getText().toString());
            int resultado = (num1+num2);

            Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
            intent.putExtra("Resultado", resultado);
            startActivity(intent);
        }
    });

    btn_resta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int num1 = Integer.parseInt(numero1.getText().toString());
            int num2 = Integer.parseInt(numero2.getText().toString());
            int resultado = (num1-num2);

            Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
            intent.putExtra("Resultado", resultado);
            startActivity(intent);
        }
    });

    btn_div.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int num1 = Integer.parseInt(numero1.getText().toString());
            int num2 = Integer.parseInt(numero2.getText().toString());
            int resultado = (num1/num2);

            Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
            intent.putExtra("Resultado", resultado);
            startActivity(intent);
        }
    });


    btn_mult.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int num1 = Integer.parseInt(numero1.getText().toString());
            int num2 = Integer.parseInt(numero2.getText().toString());
            int resultado = (num1*num2);

            Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
            intent.putExtra("Resultado", resultado);
            startActivity(intent);

        }
    });








    }
}