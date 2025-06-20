package com.victor.bdlocal.controller;

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
    Manager manager;
    EditText etCodigo, etNombre;
    Button btnInsertar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                manager = new Manager(MainActivity.this);// llamo a la conexion bd

                long resul = manager.insertCity(ciudad);// llamo al metodo que cree en el mananger
                if(resul>0){
                    Toast.makeText(MainActivity.this, "Insertado" + resul, Toast.LENGTH_SHORT).show();
                }

                Toast.makeText(MainActivity.this, "Datos no insertados" +resul, Toast.LENGTH_SHORT).show();

              }
        });


    }
}