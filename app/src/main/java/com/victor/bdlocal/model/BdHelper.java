package com.victor.bdlocal.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BdHelper extends SQLiteOpenHelper {


    public BdHelper(Context context) {
        super(context, Constantes.DB_NAME, null, Constantes.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constantes.SENTENCIA);
        db.execSQL(Constantes.CREAR_TABLA_DATOS);
        db.execSQL(Constantes.CREAR_TABLA_DEPARTAMENTO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(Constantes.BORRAR_TABLA_CIUDAD);
        db.execSQL(Constantes.BORRAR_TABLA_DATOS);
        db.execSQL(Constantes.BORRAR_TABLA_DEPARTAMENTO);
        onCreate(db);

    }
}
