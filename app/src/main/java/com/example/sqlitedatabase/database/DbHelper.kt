package com.example.sqlitedatabase.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns

class DbHelper(context: Context) : SQLiteOpenHelper(context,"SQLite_database",null,1) {

    private  val SQL_CREATE_ENTRIES: String =
        "CREATE TABLE ${FreeReaderContract.FeedEntry.TABLE_NAME} (" +
                "${BaseColumns._ID} INTEGER PRIMARY KEY," +
                "${FreeReaderContract.FeedEntry.COLUMN_NAME_TITLE} TEXT," +
                "${FreeReaderContract.FeedEntry.COLUMN_NAME_SUBTITLE} TEXT)"

    override fun onCreate(database: SQLiteDatabase?) {
       database?.execSQL(SQL_CREATE_ENTRIES)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

}
