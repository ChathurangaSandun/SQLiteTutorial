package com.clivekumara.sqlitetutorial;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by chathuranga on 1/18/2016.
 */
public class DatabaseopenHelper extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "student.db";

    // marks table name
    public static final String TABLE_MARKS = "marks";

    // marks Table Columns names
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";
    public static final String KEY_MARK= "mark";

    //crating table quary
    private static final String CREATE_MARKS_TABLE =   "CREATE TABLE " +TABLE_MARKS+" ("+KEY_ID+ " INTEGER PRIMARY KEY, " +KEY_NAME+" TEXT,"+KEY_MARK+" INTEGER)";

    //all columns
    public static final String[] ALL_COLUMNS = {DatabaseopenHelper.KEY_ID,DatabaseopenHelper.KEY_NAME,DatabaseopenHelper.KEY_MARK};




    public DatabaseopenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_MARKS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MARKS);
        onCreate(db);
    }

    public SQLiteDatabase getDatabase(){
        return getWritableDatabase();

    }







}
