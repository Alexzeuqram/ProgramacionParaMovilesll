package com.example.android.navigation

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var squareTextView: TextView
    private lateinit var textView1: TextView
    private lateinit var textView2: TextView
    private lateinit var textView3: TextView
    private lateinit var textView4: TextView
    private lateinit var textView5: TextView

    private lateinit var buttonRed: Button
    private lateinit var buttonYellow: Button
    private lateinit var buttonGreen: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        squareTextView = findViewById(R.id.textViewSquare)
        textView1 = findViewById(R.id.textView1)
        textView2 = findViewById(R.id.textView2)
        textView3 = findViewById(R.id.textView3)
        textView4 = findViewById(R.id.textView4)
        textView5 = findViewById(R.id.textView5)
        buttonRed = findViewById(R.id.buttonRed)
        buttonYellow = findViewById(R.id.buttonYellow)
        buttonGreen = findViewById(R.id.buttonGreen)


        textView1.setOnClickListener { changeColor(it) }
        textView2.setOnClickListener { changeColor(it) }
        textView3.setOnClickListener { changeColor(it) }
        textView4.setOnClickListener { changeColor(it) }
        textView5.setOnClickListener { changeColor(it) }
        squareTextView.setOnClickListener { changeColor(it) }

        buttonRed.setOnClickListener { assignRandomColor(Color.RED) }
        buttonYellow.setOnClickListener { assignRandomColor(Color.YELLOW) }
        buttonGreen.setOnClickListener { assignRandomColor(Color.GREEN) }
    }

    private fun changeColor(view: View) {
        when (view) {
            textView1 -> changeColor(textView1)
            textView2 -> changeColor(textView2)
            textView3 -> changeColor(textView3)
            textView4 -> changeColor(textView4)
            textView5 -> changeCol(textView5)
            squareTextView -> changeColo(squareTextView)
        }
    }

    private fun changeColor(textView: TextView) {
        val colors = arrayOf(Color.RED, Color.YELLOW, Color.GREEN)
        val randomColor = colors.random()
        textView.setBackgroundColor(randomColor)

    }
    private fun changeColo(textView: TextView) {
        val colors = Color.GRAY

        textView.setBackgroundColor(colors)

    }
    private fun changeCol(textView: TextView) {
        val colors = Color.BLACK

        textView.setBackgroundColor(colors)

    }

    private fun assignRandomColor(color: Int) {
        val textViews = arrayOf(textView1, textView2, textView3, textView4 )
        val randomTextView = textViews.random()
        randomTextView.setBackgroundColor(color)
    }
}
