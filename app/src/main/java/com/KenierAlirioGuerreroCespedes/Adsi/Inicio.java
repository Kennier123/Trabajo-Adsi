package com.KenierAlirioGuerreroCespedes.Adsi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ImageView opcionesImageView = findViewById(R.id.Opciones);
        opcionesImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOpcionesActivity();
            }
        });
    }

    public void openOpcionesActivity() {
        Intent intent = new Intent(this, Opciones.class);
        startActivity(intent);
    }
}


