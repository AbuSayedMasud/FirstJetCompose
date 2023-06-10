package com.example.jetpackcompose

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button1=findViewById<Button>(R.id.button_1)
        button1.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondAcitivity::class.java)
            startActivity(intent)
        }

    }


}
