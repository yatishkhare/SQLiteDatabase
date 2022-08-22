package com.example.sqlitedatabase.database

import android.provider.BaseColumns

class FreeReaderContract {

    object FeedEntry:BaseColumns{
        const val TABLE_NAME="entry"
        const val COLUMN_NAME_TITLE="title"
        const val COLUMN_NAME_SUBTITLE="subtitle"
    }

}