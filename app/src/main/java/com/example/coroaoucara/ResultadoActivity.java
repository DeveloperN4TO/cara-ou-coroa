package com.example.coroaoucara;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        ImageView imageResultado = findViewById(R.id.imageResultado);
        Button buttonVoltar = findViewById(R.id.buttonVoltar);

        Bundle  dados  = getIntent().getExtras();
        int numero     = dados.getInt("numero");

        if ( numero == 0 ){
            imageResultado.setImageResource( R.drawable.moeda_cara);

        }else {
            imageResultado.setImageResource(R.drawable.moeda_coroa);

        } buttonVoltar.setOnClickListener(view -> finish());
    }
}