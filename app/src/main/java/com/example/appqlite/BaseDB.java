package com.example.appqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BaseDB  extends SQLiteOpenHelper {
    public static final String NOMBRE_DB= "PruebaDB";
    public static int VERSION_DB=1;

    //CREAMOS EL CONTRUCTOR DE LA CLASE


    public static final String TABLA_PRUEBA = "CREATE TABLE PRUEBA(Codigo TEXT PRIMARY KEY,Curso TEXT,Carrera TEXT)";

    //CONSTRUCTOR DE LA CLASE
    public BaseDB(@Nullable Context context) {

            super(context, NOMBRE_DB, null, VERSION_DB);
    }

    //Por medio de este método se ejecutan las tablas creadas que están en la base de datos
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //Por medio del método de execSQL se ejecutarán las tablas SQL...
        sqLiteDatabase.execSQL(TABLA_PRUEBA);
    }
    //este método se lanza cuando se quiere una actualización en la base de datos.
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLA_PRUEBA);
        sqLiteDatabase.execSQL(TABLA_PRUEBA);

    }
    //Por Medio de este método se procederá a guardar los registros que el usuario enviará desde la APP a la DB
    public void agregarApp(String Codigo,String Curso,String Carrera){
        SQLiteDatabase DB = getWritableDatabase();
        if(DB!=null){
            DB.execSQL("INSERT INTO PRUEBA VALUES ('"+Codigo+"','"+Curso+"','"+Carrera+"')");
            DB.close();
        }
    }
}
