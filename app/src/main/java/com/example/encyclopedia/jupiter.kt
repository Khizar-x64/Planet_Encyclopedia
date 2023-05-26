package com.example.encyclopedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class jupiter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jupiter)
        var textView=findViewById<TextView>(R.id.jupiterWiki)
        var wiki="Jupiter is the largest planet in the Solar System and is the fifth planet from the Sun. " +
                "It is a gas giant because it is so large and made of gas. The other gas giants in the Solar System " +
                "are Saturn, Uranus, and Neptune. Jupiter’s mass is 1.8986×10^27 kg, or about 318 times the mass of Earth. " +
                "This is more than twice the mass of all the other planets in the Solar System combined"
        textView.text=wiki
        findViewById<Button>(R.id.jupiterback).setOnClickListener {
            var intent = Intent(jupiter@ this, DescriptionActivity::class.java)
            startActivity(intent)
        }
    }
}