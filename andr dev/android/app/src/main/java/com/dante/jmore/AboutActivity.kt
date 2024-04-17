package com.dante.jmore

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dante.jmore.ui.theme.JMORETheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            About()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun About() {
    Column(modifier = Modifier
        .background(Color.Gray)
        .fillMaxSize()
        .padding(20.dp)
    ) {
        Text(text = "The about page", fontFamily=FontFamily.Serif
        )
        Spacer(modifier = Modifier
            .height(20.dp)
        )
        Text(text = "Welcome")

        val home= LocalContext.current
        Button(onClick = {
            home.startActivity(Intent(home,MainActivity::class.java))
        //  variable.startActivity(Intent(variable, ...Activity::class.java))
        },
            colors = ButtonDefaults.buttonColors(Color.Gray)
        ) {
            Text(text = "Home")

        }

    }
}

