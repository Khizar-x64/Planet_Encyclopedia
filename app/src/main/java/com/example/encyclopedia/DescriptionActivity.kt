package com.example.encyclopedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)
        findViewById<Button>(R.id.mercuryBtn).setOnClickListener {
            var intent = Intent(DescriptionActivity@this,Mercury::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.VenusBtn).setOnClickListener {
            var intent = Intent(DescriptionActivity@this,Venus::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.EarthBtn).setOnClickListener {
            var intent = Intent(DescriptionActivity@this,Earth::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.MarsBtn).setOnClickListener {
            var intent = Intent(DescriptionActivity@this,Mars::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.JupiterBtn).setOnClickListener {
            var intent = Intent(DescriptionActivity@this,jupiter::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.SaturnBtn).setOnClickListener {
            var intent = Intent(DescriptionActivity@this,Saturn::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.UranusBtn).setOnClickListener {
            var intent = Intent(DescriptionActivity@this,Uranus::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.NeptuneBtn).setOnClickListener {
            var intent = Intent(DescriptionActivity@this,Neptune::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.PlutoBtn).setOnClickListener {
            var intent = Intent(DescriptionActivity@this,Pluto::class.java)
            startActivity(intent)
        }
    }
}