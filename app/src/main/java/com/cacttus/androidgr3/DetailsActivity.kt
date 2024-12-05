package com.cacttus.androidgr3

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class DetailsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_layout)

        var photo = findViewById<ImageView>(R.id.details_image)
        var name = findViewById<TextView>(R.id.details_name)


        photo.setImageResource(intent.getIntExtra("image", 0))
        name.text = intent.getStringExtra("name")
    }
}