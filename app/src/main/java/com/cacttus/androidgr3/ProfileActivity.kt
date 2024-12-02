package com.cacttus.androidgr3

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.widget.AppCompatButton

class ProfileActivity : ComponentActivity() {
    private lateinit var username: TextView
    private lateinit var likeButton: AppCompatButton
    private lateinit var commentButton: AppCompatButton
    private lateinit var shareButton: AppCompatButton
    private lateinit var description: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relative_layout)

        username = findViewById(R.id.username)

        var passedArgument = intent.getStringExtra("username")

        username.text = passedArgument
        likeButton = findViewById(R.id.btn_like)
        commentButton = findViewById(R.id.btn_comment)
        shareButton = findViewById(R.id.btn_share)
        description = findViewById(R.id.post_description)


        likeButton.setOnClickListener {
            Toast.makeText(this, "Like button clicked", Toast.LENGTH_LONG).show()
        }
        commentButton.setOnClickListener {
            Toast.makeText(this, "Comment button clicked", Toast.LENGTH_LONG).show()
        }
        shareButton.setOnClickListener {
            Toast.makeText(this, "Share button clicked", Toast.LENGTH_LONG).show()
            var newIntent = Intent(this@ProfileActivity, NewActivity::class.java)
            newIntent.putExtra("username", username.text.toString())
            newIntent.putExtra("description", description.text.toString())
            startActivity(newIntent)
        }

    }
}