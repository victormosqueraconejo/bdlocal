package com.victor.bdlocal.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.victor.bdlocal.R;
import com.victor.bdlocal.model.Departamento;
import com.victor.bdlocal.model.Manager;

public class RegistrarDepartamento extends AppCompatActivity {

    EditText etCdoDep, etNameDep;
    Button btnInsertarDep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registrar_departamento);

        etCdoDep = findViewById(R.id.etCodigoDep);
        etNameDep = findViewById(R.id.etNombreDep);
        btnInsertarDep = findViewById(R.id.btnIngresarDep);


        btnInsertarDep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int codigoDep = Integer.parseInt(etCdoDep.getText().toString());
                String nombreDep = etNameDep.getText().toString();

                Departamento departamento = new Departamento(codigoDep, nombreDep);
                Manager manager = new Manager(RegistrarDepartamento.this);

                long resultDep = manager.insertDep(departamento);

                if (resultDep > 0) {
                    Toast.makeText(RegistrarDepartamento.this, "Registrado Correctamente: " + resultDep, Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(RegistrarDepartamento.this, "NO se Registro Correctamente: " + resultDep, Toast.LENGTH_SHORT).show();
                }




            }
        });



    }
}