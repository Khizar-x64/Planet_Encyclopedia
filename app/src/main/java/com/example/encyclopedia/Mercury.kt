package com.example.encyclopedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Mercury : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mercury)
        var textView=findViewById<TextView>(R.id.mercuryWiki)
        var wiki="Mercury is the smallest planet in our solar system and is the closest planet to the Sun. " +
                "It is one of four terrestrial planets in the Solar System, and is a rocky body like Earth. " +
                "Mercury has a solid surface that is covered with craters like our Moon. " +
                "It has a large metallic core with a radius of about 1,289 miles (2,074 kilometers), " +
                "about 85 percent of the planet’s radius. There is evidence that it is partly molten or liquid."
        textView.text=wiki
        findViewById<Button>(R.id.mercuryBack).setOnClickListener {
            var intent = Intent(Mercury@ this, DescriptionActivity::class.java)
            startActivity(intent)
        }
    }
}