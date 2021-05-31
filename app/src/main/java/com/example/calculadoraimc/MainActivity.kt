package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btn_calcule)
        var height = findViewById<EditText>(R.id.edt_altura)
        var weight = findViewById<EditText>(R.id.edt_peso)
        var result = findViewById<TextView>(R.id.txt_resultado)

        btn.setOnClickListener{
            val h: Float = height.text.toString().toFloat()/100
            val w: Float = weight.text.toString().toFloat()
            val res: Float = w/(h*h)
            result.text = "Seu IMC é %.2f".format(res)
        }
    }
}