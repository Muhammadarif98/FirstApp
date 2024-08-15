package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editTextTV:EditText
    private lateinit var buttonTv:Button
    private lateinit var textResult:TextView
    private lateinit var textTitle:TextView
    private lateinit var countText:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextTV = findViewById(R.id.editTextTV)
        buttonTv = findViewById(R.id.buttonBTN)
        textResult = findViewById(R.id.textResult)
        textTitle = findViewById(R.id.textTV)
        countText = findViewById(R.id.countText)

        onClick(buttonTv)
    }

    fun onClick(view:View){
        val sendText = editTextTV.text
        val textWithoutSpaces = sendText.filterNot { it.isWhitespace() }
        textResult.text = sendText.reversed()
        countText.text = textWithoutSpaces.length.toString()
    }

}