package com.KenierAlirioGuerreroCespedes.Adsi;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Opciones extends AppCompatActivity {

    private TextView usernameTextView;
    private Button editUsernameButton;
    private Button friendsButton;
    private Button logoutButton;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        // Inicialización de vistas
        usernameTextView = findViewById(R.id.usernameTextView);
        editUsernameButton = findViewById(R.id.editUsernameButton);
        friendsButton = findViewById(R.id.friendsButton);
        logoutButton = findViewById(R.id.logoutButton);
        imageView = findViewById(R.id.imageView2);
        //obtener nombre usuario
        SharedPreferences sharedPreferences = getSharedPreferences("usuarios", MODE_PRIVATE);
        String usuario=sharedPreferences.getString("usuario","");
        usernameTextView.setText(usuario);
        // Configuración de listeners para los botones
        editUsernameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para manejar el clic en el botón de editar usuario
            }
        });

        friendsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para manejar el clic en el botón de amigos
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigir a la actividad Registro.java al hacer clic en "Cerrar Sesión"
                Intent intent = new Intent(Opciones.this, Registro.class);
                startActivity(intent);
                finish(); // Opcional, para cerrar la actividad actual si es necesario
            }
        });
    }
}

