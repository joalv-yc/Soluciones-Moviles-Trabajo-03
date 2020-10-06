package com.example.trabajo03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Icont, Ocont, txtPregunta, TResult;
    ImageView In,Oc;
    Button Votar;
    String ganador;
    int Voto1=0, Voto2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPregunta = findViewById(R.id.tv_textView);
        TResult = findViewById(R.id.txtResult);

        In = findViewById(R.id.img_inter);
        Oc = findViewById(R.id.img_oip);

        final TextView Icont = findViewById(R.id.tv_voto1);
        final TextView Ocont = findViewById(R.id.tv_voto2);

        Button Votar = findViewById(R.id.btn_Votar);

        Oc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voto1 = Voto1 + 1;
                Toast.makeText(getApplicationContext(),"Tu votaste por Ocean's Elevens", Toast.LENGTH_SHORT).show();
                String contador = Ocont.getText().toString().trim();
                int count = Integer.parseInt(contador);
                count++;
                Ocont.setText(String.valueOf(count));


            }
        });

        In.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                Voto2 = Voto2 + 1;
                Toast.makeText(getApplicationContext(),"Tu votaste por Interestellar", Toast.LENGTH_SHORT).show();
                String contador = Icont.getText().toString().trim();
                int count = Integer.parseInt(contador);
                count++;
                Icont.setText(String.valueOf(count));

            }
        });


        Button resultado = (Button) findViewById(R.id.btn_Votar);
        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = getIntent();

                int V1 = Voto1;
                int V2 = Voto2;

                if (V1>V2){
                   TResult.setText("Va ganando Ocean's Eleven");
                }
                else{
                    TResult.setText("Va ganando Interestellar");
                }

            }
        });


    }







}