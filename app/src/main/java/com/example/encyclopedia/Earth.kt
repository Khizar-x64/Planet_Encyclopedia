package com.example.encyclopedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Earth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_earth)
        var textView=findViewById<TextView>(R.id.earthWiki)
        var wiki="Earth is the third planet from the Sun and the only place known in the universe where life has originated and found habitability. " +
                "It has an atmosphere that contains mostly nitrogen and oxygen, and a history that spans over 4.5 billion years. "
        textView.text=wiki
        findViewById<Button>(R.id.earthBack).setOnClickListener {
            var intent = Intent(Earth@ this, DescriptionActivity::class.java)
            startActivity(intent)
        }
    }
}