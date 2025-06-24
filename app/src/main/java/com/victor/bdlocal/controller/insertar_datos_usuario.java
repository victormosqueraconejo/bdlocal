package com.victor.bdlocal.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.victor.bdlocal.R;
import com.victor.bdlocal.model.DatosUsuario;
import com.victor.bdlocal.model.Manager;

public class insertar_datos_usuario extends AppCompatActivity {

    Manager manager;
    EditText etCodigoUs, etNombreUs, etApellidoUs, etTelefono, etCedula;
    Button btnInsertarDat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertar_datos_usuario);

        etCodigoUs = findViewById(R.id.etCodigoDat);
        etNombreUs = findViewById(R.id.etNombreDat);
        etApellidoUs = findViewById(R.id.etApellidoDat);
        etTelefono = findViewById(R.id.etTelefonoDat);
        etCedula =findViewById(R.id.etCedulaDat);
        btnInsertarDat = findViewById(R.id.btnInsertarDatos);

        btnInsertarDat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatosUsuario datosUsuario = new DatosUsuario(
                        Integer.parseInt(etCodigoUs.getText().toString()),
                        etNombreUs.getText().toString(),
                        etApellidoUs.getText().toString(),
                        etCedula.getText().toString(),
                        Integer.parseInt(etTelefono.getText().toString()));

                manager = new Manager(insertar_datos_usuario.this);
                long resultDat = manager.insertUser(datosUsuario);

                if (resultDat > 0) {
                    Toast.makeText(insertar_datos_usuario.this, "Insertado Correctamente: " + resultDat, Toast.LENGTH_SHORT).show();
                } else if (resultDat < 0) {
                    Toast.makeText(insertar_datos_usuario.this, "NO se Insertaron Correctamente los Datos: " + resultDat, Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}