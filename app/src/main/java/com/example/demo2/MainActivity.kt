package com.example.demo2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }
    
    private fun makeColored(view: View){
        when(view.id){
            R.id.box_one-> view.setBackgroundColor(Color.CYAN)
            R.id.box_two-> view.setBackgroundColor(Color.CYAN)
            R.id.box_three-> view.setBackgroundColor(Color.CYAN)
            R.id.box_four-> view.setBackgroundColor(Color.CYAN)
            R.id.box_five-> view.setBackgroundColor(Color.CYAN)
            val boxThree = findViewById<TextView>(R.id.box_three)
            R.id.red_button-> boxThree.setBackgroundResource(Color.RED)

            else-> view.setBackgroundColor(Color.GRAY)
        }
     fun setListener(){
        val boxOne = findViewById<TextView>(R.id.box_one)
         val boxTwo = findViewById<TextView>(R.id.box_two)
         val constraint = findViewById<View>(R.id.constraint)
         val red = findViewById<Button>(R.id.red_button)

         val clickableViews: List<View> = listOf(boxOne, boxTwo, red)

         for (item in clickableViews){
             item.setOnClickListener{
                 makeColored(item)
             }
         }
    }
    }

}