package com.KenierAlirioGuerreroCespedes.Adsi;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Inicio extends AppCompatActivity {

    private boolean isFirstSelection = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Spinner optionsSpinner = findViewById(R.id.options_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.spinner_options,
                android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        optionsSpinner.setAdapter(adapter);

        optionsSpinner.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (isFirstSelection) {
                    optionsSpinner.setSelection(0); // Selecciona el primer elemento
                    isFirstSelection = false;
                }
                return false;
            }
        });

        optionsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();

                // Realiza acciones basadas en la opción seleccionada
                if (selectedItem.equals("Usuario")) {
                    // Acción para la opción Usuario
                } else if (selectedItem.equals("Amigo")) {
                    // Acción para la opción Amigo
                } else if (selectedItem.equals("Cerrar Sesión")) {
                    // Iniciar la actividad Registro
                    Intent intent = new Intent(Inicio.this, Registro.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // No es necesario implementar nada aquí para este caso
            }
        });
    }
}
