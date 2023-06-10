package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val composeView=findViewById<ComposeView>(R.id.compose_1)
        composeView.setContent{
            setComposeContent()
        }

    }
    @Composable
    fun setComposeContent(){
          Column() {
              Text(text = "this is compose View")
              AndroidView(
                  factory = { context ->
                      layoutInflater.inflate(R.layout.fourth_activity, null)
                  },
                  modifier = Modifier.fillMaxWidth()
              )
          }
    }
}
