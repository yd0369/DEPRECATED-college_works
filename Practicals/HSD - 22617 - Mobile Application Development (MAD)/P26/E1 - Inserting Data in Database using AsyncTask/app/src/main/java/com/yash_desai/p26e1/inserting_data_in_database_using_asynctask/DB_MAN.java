package com.yash_desai.p26e1.inserting_data_in_database_using_asynctask;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;


public class DB_MAN extends SQLiteOpenHelper {

    Context context;
    private static final String CREATE_QUERY = "CREATE TABLE " + MainActivity.DB_TABLE_NAME
            + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, "
            + " DATA TEXT NOT NULL);";


    DB_MAN(Context context) {
        super(context,MainActivity.DB_NAME,null,MainActivity.DB_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void Insert(SQLiteDatabase db,String DATA) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("DATA",DATA);
        db.insert(MainActivity.DB_TABLE_NAME,null,contentValues);
        db.close();
    }

}