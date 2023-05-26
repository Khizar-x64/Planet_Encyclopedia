package com.example.encyclopedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Saturn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saturn)
        var textView=findViewById<TextView>(R.id.SaturnWiki)
        var wiki="Saturn is the sixth planet from the Sun and the second-largest in the Solar System, after Jupiter." +
                " It is a gas giant with an average radius of about nine and a half times that of Earth. " +
                "It has only one-eighth the average density of Earth, but is over 95 times more massive"
        textView.text=wiki
        findViewById<Button>(R.id.saturnBack).setOnClickListener {
            var intent = Intent(Saturn@ this, DescriptionActivity::class.java)
            startActivity(intent)
        }
    }
}