package com.cacttus.androidgr3

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class ProfileActivity : ComponentActivity() {
    private lateinit var username: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relative_layout)

        username = findViewById(R.id.username)

        var passedArgument = intent.getStringExtra("username")

        username.text = passedArgument

    }

}