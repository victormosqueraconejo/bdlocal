package com.victor.bdlocal.controller;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.victor.bdlocal.R;
import com.victor.bdlocal.model.BdHelper;
import com.victor.bdlocal.model.Ciudad;
import com.victor.bdlocal.model.Manager;

public class MainActivity extends AppCompatActivity {
    Button btnCiudad, btnDep, btnDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCiudad = findViewById(R.id.btnInsertarCiudad);
        btnDep = findViewById(R.id.btnInsertarDepartamento);
        btnDatos = findViewById(R.id.btnInsertarDatosPersonales);

        btnCiudad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(MainActivity.this, insertar_ciudad.class);
                startActivity(siguiente);
            }
        });

        btnDep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(MainActivity.this, RegistrarDepartamento.class);
                startActivity(siguiente);
            }
        });

        btnDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(MainActivity.this, insertar_datos_usuario.class);
                startActivity(siguiente);
            }
        });



    }
}