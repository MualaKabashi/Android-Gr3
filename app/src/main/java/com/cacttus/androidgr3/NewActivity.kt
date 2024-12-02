package com.cacttus.androidgr3

import android.os.Bundle
import androidx.activity.ComponentActivity

class NewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_activity)
    }
}