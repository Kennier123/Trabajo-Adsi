package com.KenierAlirioGuerreroCespedes.Adsi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Registro extends AppCompatActivity {

    private EditText editTextUsuario;
    private EditText editTextCorreo;
    private EditText editTextContrasena;
    private Button botonRegistrar;
    private TextView textViewIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        editTextUsuario = findViewById(R.id.editTextUsuario);
        editTextCorreo = findViewById(R.id.editTextCorreo);
        editTextContrasena = findViewById(R.id.editTextContrasena);
        botonRegistrar = findViewById(R.id.botonRegistrar);
        textViewIniciarSesion = findViewById(R.id.textViewIniciarSesion);

        botonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes agregar la lógica para registrar al usuario
                String usuario = editTextUsuario.getText().toString();
                String correo = editTextCorreo.getText().toString();
                String contrasena = editTextContrasena.getText().toString();
                // Lógica para el registro
            }
        });

        textViewIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí abrimos la actividad IniciarSesionActivity
                Intent intent = new Intent(Registro.this, Iniciar.class);
                startActivity(intent);
            }
        });
    }
}
