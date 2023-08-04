package com.KenierAlirioGuerreroCespedes.Adsi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Iniciar extends AppCompatActivity {

    private EditText editTextCorreo;
    private EditText editTextContrasena;
    private Button botonIniciarSesion;
    private TextView textViewRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar);

        editTextCorreo = findViewById(R.id.editTextCorreo);
        editTextContrasena = findViewById(R.id.editTextContrasena);
        botonIniciarSesion = findViewById(R.id.botonIniciarSesion);
        textViewRegistrarse = findViewById(R.id.textViewRegistrarse);

        botonIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes agregar la lógica para iniciar sesión
                String correo = editTextCorreo.getText().toString();
                String contrasena = editTextContrasena.getText().toString();
                // Lógica para el inicio de sesión
            }
        });

        textViewRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí abrimos la actividad Registro
                Intent intent = new Intent(Iniciar.this, Registro.class);
                startActivity(intent);
            }
        });
    }
}

