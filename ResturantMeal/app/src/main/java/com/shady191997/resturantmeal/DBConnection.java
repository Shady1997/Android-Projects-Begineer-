package com.shady191997.resturantmeal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBConnection extends SQLiteOpenHelper {
    public DBConnection(Context context) {
        super(context, "restrant", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
     db.execSQL("create table if not exists restrant_imges(id integer primary key autoincrement,image blob not null)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists restrant_imges");
        onCreate(db);
    }

    public void insertimg()
    {

    }
}
