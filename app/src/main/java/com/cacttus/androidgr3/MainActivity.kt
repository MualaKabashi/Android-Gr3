package com.cacttus.androidgr3

import android.app.AlertDialog
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : ComponentActivity() {
//    private lateinit var editText: EditText
//    private lateinit var button5: AppCompatButton
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.calculator_layout)
//
//        editText = findViewById(R.id.number)
//        button5 = findViewById(R.id.btn_5)
//
//
//        button5.setOnClickListener {
//            //use button.setText to change the value of the edit text
//            editText.setText(button5.text)
//        }
//    }

    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var login: AppCompatButton
    private lateinit var forgetPassword: AppCompatButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindViews()


        login.setOnClickListener {
            if (username.text.toString().isBlank() || password.text.toString().isBlank()) {
                Toast.makeText(this, "Please enter your credentials!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Logged in successfully!", Toast.LENGTH_SHORT).show()
            }
        }

        forgetPassword.setOnClickListener {
            displayAlert(
                "Reset Password",
                "Are you sure you want to reset your password?",
                "Ok",
                "A reset password link was sent to your account!",
                "Cancel",
                "Canceled"
            )
        }


    }

    private fun bindViews() {
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        login = findViewById(R.id.login)
        forgetPassword = findViewById(R.id.btn_forgetPassword)
    }


    fun displayAlert(
        title: String, message: String, positiveButtonText: String,
        positiveToastMessage: String, neutralButtonText: String,
        neutralToastMessage: String
    ) {
        var builder = AlertDialog.Builder(this)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton(positiveButtonText) { _, _ ->
            Toast.makeText(
                this,
                positiveToastMessage,
                Toast.LENGTH_LONG
            ).show()
        }

        builder.setNeutralButton(neutralButtonText) { _, _ ->
            Toast.makeText(this, neutralToastMessage, Toast.LENGTH_LONG).show()
        }


        var alertDialog = builder.create()
        alertDialog.setCancelable(false)
        alertDialog.show()
    }
}

