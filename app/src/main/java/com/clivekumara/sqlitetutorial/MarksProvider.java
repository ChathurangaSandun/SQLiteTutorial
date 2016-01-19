package com.clivekumara.sqlitetutorial;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by chathuranga on 1/19/2016.
 */
public class MarksProvider {
    DatabaseopenHelper databaseopenHelper;
    SQLiteDatabase database;

    public MarksProvider(Context c) {
        databaseopenHelper = new DatabaseopenHelper(c);
        database = databaseopenHelper.getDatabase();
    }

    void addContact(Marks marks) {
        ContentValues values = new ContentValues();
        values.put(DatabaseopenHelper.KEY_NAME,marks.getName() );
        values.put(DatabaseopenHelper.KEY_MARK, marks.getMark());

        // Inserting Row
        database.insert(DatabaseopenHelper.TABLE_MARKS, null, values);
        database.close(); // Closing database connection
    }





}
