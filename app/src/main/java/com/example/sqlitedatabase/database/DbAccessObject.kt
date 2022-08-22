package com.example.sqlitedatabase.database

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.example.sqlitedatabase.database.FreeReaderContract.FeedEntry

class DbAccessObject(var context: Context) {

    lateinit var database: SQLiteDatabase
    lateinit var dbHelper: DbHelper

    fun openDb(){

        dbHelper=DbHelper(context)
        database=dbHelper.writableDatabase

    }
    fun closeDb(){}
    fun createRow(note: Note){

        var values = ContentValues()
        values.put(FeedEntry.COLUMN_NAME_TITLE,note.getTitle())
        values.put(FeedEntry.COLUMN_NAME_SUBTITLE,note.getSubTitle())

        database.insert(FeedEntry.TABLE_NAME,null,values)


    }
    fun readRow(){}
    fun getAllRows(){}
    fun deleteRow(){}

}


