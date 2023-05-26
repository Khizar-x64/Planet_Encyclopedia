package com.example.encyclopedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Mars : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mars)
        var textView=findViewById<TextView>(R.id.marsWiki)
        var wiki="Mars is the fourth planet from the sun and is known as the Red Planet due" +
                " to its reddish appearance. It is among the brightest objects in Earth’s sky" +
                " and has considerable cultural significance; the name Mars is that of the Roman god of war." +
                " The planet has been explored remotely by spacecraft. The atmosphere of Mars is primarily composed " +
                "of carbon dioxide (95%), molecular nitrogen (2.8%), and argon (2%). It also contains trace levels " +
                "of water vapor, oxygen, carbon monoxide, hydrogen, and noble gases. The atmosphere of Mars is much thinner than Earth’s"
        textView.text=wiki
        findViewById<Button>(R.id.marsBack).setOnClickListener {
            var intent = Intent(Mars@ this, DescriptionActivity::class.java)
            startActivity(intent)
        }
    }
}