package com.example.sqlitedatabase

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.sqlitedatabase.database.DbAccessObject
import com.example.sqlitedatabase.database.Note

class MainActivity : AppCompatActivity() {
    lateinit var dbAccessObject :DbAccessObject
    lateinit var mainTitle: EditText
    lateinit var subTitle: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dbAccessObject = DbAccessObject(this)
        dbAccessObject.openDb()
    }

   fun dbHandler(view: View){

       when(view.id){
           R.id.btnCommit ->{putDataDb()}
           R.id.btnExtract->{getDataDb()}
       }

   }

    private fun getDataDb() {}

    private fun putDataDb() {
        var title=mainTitle.text.toString()
        var subTitle= subTitle.text.toString()
        var note=Note(title, subTitle);
        dbAccessObject.createRow(note)

    }

}