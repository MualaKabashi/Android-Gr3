package com.cacttus.androidgr3

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.ComponentActivity

class SimpleListActivity : ComponentActivity() {
    private lateinit var studentsList: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_list_layout)

        studentsList = findViewById(R.id.simple_list)

        var adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            listOf(
                "Adonit",
                "Ylli",
                "Labinot",
                "Drini",
                "Jon",
                "Edin",
                "Daor",
                "Muala",
                "Ervin",
                "Kreshnik",
                "Hashim",
                "Isa",
                "Albin"
            )
        )

        studentsList.adapter = adapter
    }
}