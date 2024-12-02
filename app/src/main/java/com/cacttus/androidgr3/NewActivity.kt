package com.cacttus.androidgr3

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class NewActivity : ComponentActivity() {
    private lateinit var simpleText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_activity)

        simpleText = findViewById(R.id.simple_text)

        var passedUsername = intent.getStringExtra("username")
        var passedDescription = intent.getStringExtra("description")
        var newText = "User $passedUsername posted this description: $passedDescription"

        simpleText.text = newText
    }
}