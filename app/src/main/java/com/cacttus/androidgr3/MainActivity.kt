package com.cacttus.androidgr3

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : ComponentActivity() {
    private lateinit var editText: EditText
    private lateinit var button5: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_layout)

        editText = findViewById(R.id.number)
        button5 = findViewById(R.id.btn_5)


        button5.setOnClickListener {
            //use button.setText to change the value of the edit text
            editText.setText(button5.text)
        }
    }
}

