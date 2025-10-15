package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var n1: EditText
    lateinit var n2: EditText
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        n1 = findViewById(R.id.n1)
        n2 = findViewById(R.id.n2)
        result = findViewById(R.id.result)
    }

    // Simple function to read numbers safely
    fun getNumbers(): Pair<Double, Double> {
        val num1 = n1.text.toString().toDoubleOrNull() ?: 0.0
        val num2 = n2.text.toString().toDoubleOrNull() ?: 0.0
        return Pair(num1, num2)
    }

    fun addNumbers(view: View) {
        val (a, b) = getNumbers()
        result.text = (a + b).toString()
    }

    fun subNumbers(view: View) {
        val (a, b) = getNumbers()
        result.text = (a - b).toString()
    }

    fun mulNumbers(view: View) {
        val (a, b) = getNumbers()
        result.text = (a * b).toString()
    }

    fun divNumbers(view: View) {
        val (a, b) = getNumbers()
        if (b == 0.0) {
            result.text = "Error"
        } else {
            result.text = (a / b).toString()
        }
    }
}
