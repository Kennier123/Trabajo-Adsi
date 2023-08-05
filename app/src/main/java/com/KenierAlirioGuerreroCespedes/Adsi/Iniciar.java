package com.KenierAlirioGuerreroCespedes.Adsi;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
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
                // Obtén los datos ingresados por el usuario
                String correo = editTextCorreo.getText().toString();
                String contrasena = editTextContrasena.getText().toString();

                if(correo.isEmpty()){
                    editTextCorreo.setError("Debes poner un correo");
                    return;
                }

                if (contrasena.isEmpty()){
                    editTextContrasena.setError("Debes poner una contraseña");
                    return;
                }

                // Recupera los datos almacenados en SharedPreferences
                SharedPreferences sharedPreferences = getSharedPreferences("usuarios", MODE_PRIVATE);
                String savedContrasena = sharedPreferences.getString(correo + "_contrasena", "");

                // Comprueba si las contraseñas coinciden
                if (contrasena.equals(savedContrasena)) {
                    // Contraseña válida, redirige a la actividad de Inicio
                    Intent intent = new Intent(Iniciar.this, Inicio.class);
                    startActivity(intent);
                } else {
                    // Contraseña incorrecta, muestra un mensaje de error
                    Toast.makeText(Iniciar.this, "Datos de inicio de sesión incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        textViewRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirige a la actividad Registro.java
                Intent intent = new Intent(Iniciar.this, Registro.class);
                startActivity(intent);
            }
        });
    }
}



