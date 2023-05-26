package com.example.encyclopedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Pluto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pluto)
        var textView=findViewById<TextView>(R.id.plutoWiki)
        var wiki="Pluto is a dwarf planet in the Kuiper belt, a ring of bodies beyond the " +
                "orbit of Neptune. It is the ninth-largest and tenth-most-massive known " +
                "object to directly orbit the Sun. It is the largest known trans-Neptunian " +
                "object by volume, by a small margin, but is slightly less massive than Eris"
        textView.text=wiki
        findViewById<Button>(R.id.plutoBack).setOnClickListener {
            var intent = Intent(pluto@ this, DescriptionActivity::class.java)
            startActivity(intent)
        }
    }
 }