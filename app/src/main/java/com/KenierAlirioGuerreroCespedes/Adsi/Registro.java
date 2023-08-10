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
                // Obtén los datos ingresados por el usuario
                String Usuario = editTextUsuario.getText().toString();
                String correo = editTextCorreo.getText().toString();
                String contrasena = editTextContrasena.getText().toString();

                if (Usuario.isEmpty()){
                    editTextUsuario.setError("Debes poner un nombre de usuario");
                    return;
                }

                if (correo.isEmpty()){
                    editTextCorreo.setError("Debes poner un correo");
                    return;
                }

                if (contrasena.isEmpty()){
                    editTextContrasena.setError("Debes poner una contraseña");
                    return;
                }

                // Guarda los datos en SharedPreferences
                SharedPreferences sharedPreferences = getSharedPreferences("usuarios", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("correo", correo);
                editor.putString("usuario", Usuario);
                editor.putString("contrasena", contrasena);
                editor.apply();

                // Muestra un mensaje de éxito
                Toast.makeText(Registro.this, "Registro exitoso", Toast.LENGTH_SHORT).show();

                Intent intento = new Intent(Registro.this, Iniciar.class);
                startActivity(intento);
            }
        });

        textViewIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirige a la actividad Iniciar.java
                Intent intent = new Intent(Registro.this, Iniciar.class);
                startActivity(intent);
            }
        });
    }
}


