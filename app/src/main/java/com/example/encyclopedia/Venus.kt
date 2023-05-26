package com.example.encyclopedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Venus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_venus)
        var textView=findViewById<TextView>(R.id.VenusWiki)
        var wiki="Venus is a fascinating planet. It is the second planet from the Sun and the sixth in the solar system" +
                " in size and mass. It is often called Earth’s twin because it has a similar size and density to Earth. " +
                "However, it also has many differences from Earth, such as a thick atmosphere of mostly carbon dioxide," +
                " a runaway greenhouse effect that makes it the hottest planet in our solar system, and a retrograde rotation " +
                "that means it spins backward on its axis. Venus has no moons and no known life forms"
        textView.text=wiki
        findViewById<Button>(R.id.venusBack).setOnClickListener {
            var intent = Intent(Venus@ this, DescriptionActivity::class.java)
            startActivity(intent)
        }
    }
}