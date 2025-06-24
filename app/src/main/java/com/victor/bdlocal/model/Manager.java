package com.victor.bdlocal.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.victor.bdlocal.controller.MainActivity;

public class Manager {

    BdHelper bdHelper;
    SQLiteDatabase db;

    public Manager(Context context) {
        //llamando a la conexion de la base de datos
        bdHelper = new BdHelper(context);
    }

    public void openBdWr(){
        // metodo para abrir bd en modo escritura
        db = bdHelper.getWritableDatabase();
      }
       public void openBdRd(){
           db=bdHelper.getReadableDatabase();
    }
    public long insertCity(Ciudad ciudad){
       // paso 1. abro la base de datos en modo escritura
        openBdWr();
        // Creo un contenedor de valores para almacenar campos
        ContentValues valores = new ContentValues();
        valores.put("code", ciudad.getCod());
        valores.put("name",ciudad.getNameCity());
        long resul = db.insert("Ciudad",null,valores);//ya inserta en la bd
         return resul;
    }
    public long insertDep (Departamento departamento) {
        openBdWr();
        ContentValues valoresDep = new ContentValues();
        valoresDep.put("code_dep", departamento.getCode_dep());
        valoresDep.put("name", departamento.getName());
        long resultDep = db.insert("Departamento", null, valoresDep);
        return resultDep;
    }

    public long insertUser (DatosUsuario datosUsuario) {
        openBdWr();
        ContentValues valoresUs = new ContentValues();
        valoresUs.put("code_dat", datosUsuario.getCodigoUs());
        valoresUs.put("name", datosUsuario.getNombre());
        valoresUs.put("apellido", datosUsuario.getApellido());
        valoresUs.put("telefono", datosUsuario.getTelefono());
        long resultDat = db.insert("Datos", null, valoresUs);
        return  resultDat;

    }
}
