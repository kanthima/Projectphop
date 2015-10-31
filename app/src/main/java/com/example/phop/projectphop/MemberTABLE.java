package com.example.phop.projectphop;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.ArrayAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by PHOP on 16/10/2558.
 */
public class MemberTABLE {

    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSQLite, readSQLite;
    private double doubmi;
    private double data;
    private int intId,i;


    public static final String TABLE_MEMBER = "MemberTABLE";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_SEX = "sex";
    public static final String COLUMN_WEIGHT = "weight";
    public static final String COLUMN_HEIGHT = "height";
    public static final String COLUMN_RESULTBMI = "resultbmi";

    public MemberTABLE(Context context) {
        objMyOpenHelper = new MyOpenHelper(context);
        writeSQLite = objMyOpenHelper.getWritableDatabase();
        readSQLite = objMyOpenHelper.getReadableDatabase();
    }//Constuctor

    public double currentBmi(){
        Cursor objcursor=readSQLite.query(TABLE_MEMBER,new String[]{COLUMN_ID,COLUMN_NAME,COLUMN_SEX,COLUMN_WEIGHT,COLUMN_HEIGHT,
                COLUMN_RESULTBMI},null,null,null,null,null);
        if (objcursor!=null){
            objcursor.moveToLast();
            doubmi = objcursor.getDouble(objcursor.getColumnIndex(COLUMN_RESULTBMI));
        }
        return doubmi;
    }
    public double currentBmiall() {

        Cursor objcursor = readSQLite.query(TABLE_MEMBER, new String[]{COLUMN_ID, COLUMN_NAME, COLUMN_SEX, COLUMN_WEIGHT, COLUMN_HEIGHT,
                COLUMN_RESULTBMI}, null, null, null, null, null);
        if (objcursor != null) ;
        {
            objcursor.moveToFirst();
        }

        while (!objcursor.isAfterLast()) {
            data = objcursor.getDouble(objcursor.getColumnIndex(COLUMN_RESULTBMI));
            objcursor.moveToNext();
        }
        return data;
    }


    public int CurrentIdBmi(){
        Cursor objcursor=readSQLite.query(TABLE_MEMBER,new String[]{COLUMN_ID,COLUMN_NAME,COLUMN_SEX,COLUMN_WEIGHT,COLUMN_HEIGHT,
                COLUMN_RESULTBMI},null,null,null,null,null);
        if (objcursor!=null){
            objcursor.moveToLast();
            intId = objcursor.getInt(objcursor.getColumnIndex(COLUMN_ID));
        }
        return intId;

    }

    public long addNewValueToSQLite(String strName,Integer intSex, Double douWeight, Double douHeight ,Double douResultbmi) {

        ContentValues objContentValue = new ContentValues();
        objContentValue.put(COLUMN_NAME, strName);
        objContentValue.put(COLUMN_SEX, intSex);
        objContentValue.put(COLUMN_WEIGHT, douWeight);
        objContentValue.put(COLUMN_HEIGHT, douHeight);
        objContentValue.put(COLUMN_RESULTBMI, douResultbmi);

        return writeSQLite.insert(TABLE_MEMBER, null, objContentValue);
    }
}
