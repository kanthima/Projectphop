package com.example.phop.projectphop;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by PHOP on 16/10/2558.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME="Fitandfirm1.db";
    private static final int DATABASE_VERSION=1;
    private static final String CREATE_TABLE="create table MemberTABLE(_id integer primary key,name string,sex integer,weight double,height double,resultbmi double);";

    public MyOpenHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}//mainclass
