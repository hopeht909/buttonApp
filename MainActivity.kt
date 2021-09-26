package com.example.kotlinone

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var  tv: TextView
    lateinit var  minusButton: Button
    lateinit var  plusButton: Button
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.textView)
        minusButton = findViewById(R.id.button)
        plusButton= findViewById(R.id.button3)

        minusButton.setOnClickListener {
            count--
            tv.text = "$count"
            checkNum()
        }

        plusButton.setOnClickListener {
            count++
            tv.text = "$count"
            checkNum()
        }}

        fun checkNum(){
            if(count < 0){
                tv.setTextColor(Color.parseColor("#f08080"))
            }
            else if (count == 0){
                tv.setTextColor(Color.parseColor("#000000"))
        }
            else{
                tv.setTextColor(Color.parseColor("#3cb371"))
            }
    }
}