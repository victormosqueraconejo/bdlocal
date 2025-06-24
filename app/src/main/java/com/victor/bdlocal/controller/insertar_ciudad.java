package com.victor.bdlocal.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.victor.bdlocal.R;
import com.victor.bdlocal.model.Ciudad;
import com.victor.bdlocal.model.Manager;

public class insertar_ciudad extends AppCompatActivity {

    Manager manager;
    EditText etCodigo, etNombre;
    Button btnInsertar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_insertar_ciudad);


        etCodigo = findViewById(R.id.etCodigo);
        etNombre = findViewById(R.id.etNombre);
        btnInsertar = findViewById(R.id.btnIngresar);

        btnInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CAPTURO LOS VALORES DE LAS CAJAS DE TEXTO PARA PASARLOS AL OBJETO CIUDAD
                int codigo = Integer.parseInt(etCodigo.getText().toString());
                String nombre = etNombre.getText().toString();// estoy almacenando lo que tienen las cajas de texto en mi variable nombre
                Ciudad ciudad = new Ciudad(codigo,nombre);//instanciación
                manager = new Manager(insertar_ciudad.this);// llamo a la conexion bd

                long resul = manager.insertCity(ciudad);// llamo al metodo que cree en el mananger
                if(resul>0){
                    Toast.makeText(insertar_ciudad.this, "Insertado" + resul, Toast.LENGTH_SHORT).show();
                } else if (resul<0) {
                    Toast.makeText(insertar_ciudad.this, "Datos no insertados" +resul, Toast.LENGTH_SHORT).show();
                }



            }
        });
    }
}