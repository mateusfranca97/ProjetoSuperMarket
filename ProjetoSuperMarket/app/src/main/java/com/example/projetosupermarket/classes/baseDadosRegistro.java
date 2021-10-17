package com.example.projetosupermarket.classes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class baseDadosRegistro extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "ProdutosDB";
    private static final String TABLE_NAME = "Produtos";
    private static final String KEY_ID = "id";
    private static final String KEY_DESCRICAO = "descricao";
    private static final String KEY_VALOR = "valor";
    private static final String KEY_QUANTIDADE = "quantidade";
    private static final String[] COLUMNS = {KEY_ID,KEY_DESCRICAO,KEY_VALOR,KEY_QUANTIDADE};

    public baseDadosRegistro(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create_table = "CREATE TABLE"+ TABLE_NAME +
                "("+ KEY_ID+" INTEGER PRIMARY KEY AUTOINCREMENT"+
                KEY_DESCRICAO+"TEXT,"+
                KEY_QUANTIDADE+"TEXT,"+
                KEY_VALOR+"INTEGER)";

        db.execSQL(create_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
