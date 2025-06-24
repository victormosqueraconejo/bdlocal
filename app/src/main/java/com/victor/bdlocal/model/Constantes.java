package com.victor.bdlocal.model;

public class Constantes {

    public static String DB_NAME = "ejemplodb";
    public static int DB_VERSION = 3;
    public static String SENTENCIA = "CREATE TABLE Ciudad (code int, name text)";
    public static String BORRAR_TABLA_CIUDAD = "DROP TABLE IF EXISTS Ciudad";
    public static String CREAR_TABLA_DATOS = "CREATE TABLE Datos (code_dat int, name text, apellido text, cedula text, telefono int)";
    public static String BORRAR_TABLA_DATOS = "DROP TABLE IF EXISTS Datos";
    public static String CREAR_TABLA_DEPARTAMENTO = "CREATE TABLE Departamento (code_dep int, name text)";
    public static String BORRAR_TABLA_DEPARTAMENTO = "DROP TABLE IF EXISTS Departamento";

}
