package com.example.encyclopedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Neptune : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_neptune)
        var textView=findViewById<TextView>(R.id.neptuneWiki)
        var wiki="Neptune is the eighth planet from the Sun and the farthest known planet in the Solar System." +
                " It is an ice giant and is the fourth-largest planet in the Solar System by diameter, the third-most-massive planet," +
                " and the densest giant planet. " +
                "It is 17 times the mass of Earth, and slightly more massive than its near-twin Uranus"
        textView.text=wiki
        findViewById<Button>(R.id.neptuneBack).setOnClickListener {
            var intent = Intent(Neptune@ this, DescriptionActivity::class.java)
            startActivity(intent)
        }
    }
}