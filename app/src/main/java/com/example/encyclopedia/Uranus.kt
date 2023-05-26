package com.example.encyclopedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Uranus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uranus)
        var textView=findViewById<TextView>(R.id.uranusWiki)
        var wiki="Uranus is the seventh planet from the Sun and is a gaseous cyan ice giant. " +
                "Most of Uranus is made out of water, ammonia, and methane in a supercritical phase of matter, " +
                "which in astronomy is called ‘ice’ or volatiles. It was the first planet found with " +
                "the aid of a telescope and was discovered in 1781 by astronomer William Herschel"
        textView.text=wiki
        findViewById<Button>(R.id.uranusBack).setOnClickListener {
            var intent = Intent(Uranus@ this, DescriptionActivity::class.java)
            startActivity(intent)
        }
    }
}