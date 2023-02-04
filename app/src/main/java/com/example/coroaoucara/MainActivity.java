package com.example.coroaoucara;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonJogar = findViewById(R.id.buttonJogar);

        buttonJogar.setOnClickListener(v -> {

            Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

            int numero = new Random().nextInt(2);
            intent.putExtra("numero", numero);


            startActivity( intent );

        });

    }
}